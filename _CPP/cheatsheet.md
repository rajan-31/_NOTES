For more check [https://cplusplus.com/reference](https://cplusplus.com/reference/)

*abbreviations:* itr: Iterator, ds: Data Structure, ptr: Pointer.


## Libs

```cpp
#include <algorithm>

min(a, b);
min({a, b, c});

sort(beginItr, endItr);

// for itr => *itr gives index
lower_bound(beginItr, endItr, value);    // itr of equal or just greater value
upper_bound(beginItr, endItr, value);    // itr of just greater value or itr end

min_element(beginItr, endItr);           // itr of min elt
max_element(beginItr, endItr);           // itr of max elt
auto [minn, maxx] = minmax_element(beginItr, endItr);   // pair of itr of min and max elt

fill(beginItr, endItr, value);
reverse(beginItr, endItr);  // in-place
// reverse(A.begin(). A.end()) == reverse(A.begin(), A.begin()+n)   // not n-1

swap(item1, item2);    // item: array elt, whole array, vector. eg. swap(arr[0], arr[1]); swap(arr1, arr2);

// They return end itr if no value found or no predicate match
find(firstItr, lastItr, value);     // returns itr to first occurence
// predicate is boolean function with input as value
find_if(firstItr, lastItr, predicate);  // return itr when predicate is true first time
find_if_not(firstItr, lastItr, predicate);  // return itr when predicate is false first time

// can use constant itr, since no modification of value happens
binary_search(firstItr, lastItr, value);    // returns true/false

// find next permutation of vector, string
next_permutation(vec.begin(), vect.end());  // modifies orginial vec, can use (arr, arr+n)
// to get all permutations ==> sort it first
// while(next_permutation(vec.begin(), vect.end())) {// it will modify original data}

// a,b,c,d,e
// takes advantage of parallalization ==> (a+b) + (c+d) + e
int summ = reduce(firstItr, lastItr);    // if elts are float return value will be float
// reduce(firstItr, lastItr, initValue, lambdaFunc);    // lambdaFunc(prevResult, item)

// does left folding ==> (((((a)+b)+c)+d)+e)
int summ = accumulate(firstItr, lastItr, init_value);    // return value type depends on "init_value" type
// accumulate(firstItr, lastItr, init_value, lambdaFunc);    // lambdaFunc(prevResult, item)

// partially sort to put "ith" element (0-based index) at correct position, inplace
nth_element(vec.begin(), vec.begin()+i, vec.end());     // O(vec.size())

// itr of last element
// vec.end() is not itr of last elt
vec.rbegin();
vec.end() - 1;      // not safe if vec is empty
prev(vec.end());    // not safe if vec is empty


#include <vector>
/* similarly array, map, unordered_map, etc. */

#include <cmath>
/* See Math section */

#include <bits/stdc++.h>
/* 
- header file that includes every standard library
- compilation with other than GCC compiler might fail - eg. MSVC
*/
```

## Other

```cpp
// type
typeid(something).name();

// iterator
vector<string>::iterator itr = vec.begin();

// find element
ds.find(value);     // itr

// assign elements
ds.assign({ comma sep elements});
ds.assign(number_of_elements, value);    // elements with specific value

// use definitions from the namespace "std"
using namespace std;

// lambda function
[](int a, int b) {
    return a < b;
};
```

---

## Pair

- Holds two elements of possibly different types

```cpp
pair<int, string> p{1, "one"};  // declaration and initialization

// accessing elements
cout << p.first << " " << p.second << endl;

// unpacking (C++11)
int num;
string str;
tie(num, str) = p;  // num = 1, str = "one"
// OR
auto [num, str] = p;

pair<num, string>{1, "one"} == p    // valid comparison, won't work with only curly braces
```

- **IMPORTANT: Destructuring only works on one level. Same thing is applicable for `tuple` also.**

## Array

- passing array name w/o index to a function passes ptr by default

**Ordinary static C style array**

```cpp
int arr[n] = {1 ,2 ,3};
int arr[] = {1 ,2 ,3};

// size
int n = sizeof(arr)/sizeof(arr[0]);    // works even w/o array initialization

// sort - algorithms
sort(arr, arr+n);

// pointer to the underlying array serving as element storage
int* arr = vec.data();   // modifying it will also modify vector data, access like array, arr[i]

// copy vector data to array
int arr[vec.size()];
copy(vec.begin(), vec.end(),arr);

// 2D array, similarly for 3D
int arr2d[m][n];
int arr2d[m][n] = { {0, 1, 2, 3},  {4, 5, 6, 7}, {8, 9, 10, 11} };
```

**Array class**

```cpp
array<int, n> arr = {};    // default val 0

// arr.size();
// arr.empty();
```

## String

**C style character string**

```cpp
char str[n] = {'H', 'e', 'l', 'l', 'o', '\0'};
char str[] = "Hello";

strlen(s1);

// Copies string s2 into string s1.
strcpy(s1, s2);

// Concatenates string s2 onto the end of string s1.
strcat(s1, s2);

// 0 if s1 and s2 are the same; less than 0 if s1<s2; greater than 0 if s1>s2.
// strcmp(s1, s2);

// a pointer to the first occurrence of character ch in string s1.
// strchr(s1, ch);

// a pointer to the first occurrence of string s2 in string s1.
// strstr(s1, s2);
```

**String class**

```cpp
string str = "Hello";
string str = s1 + s2;

int n = str.size();    // str.length();

str.insert(pos, value);

str.append(value);
str.append(string);
str.append(string, pos, count);
str.append(count, character);

str.replace(start_pos, n, value);     // from start_pos to start_pos+n-1 replace with value (if its size is smaller than n, overall string size will reduce)

str.substr(start_pos, len);     // OR str.substr(start_pos, end_pos - start_pos + 1);
str.pop_back();     // remove 1 character from back, no return value

str.find(value);    // index else string::npos
str.find(value, start_pos);    // index else string::npos

str = to_string(123)  // (int)

// can reverse in-place using "reverse"
```

## Vector

- dynamic size

```cpp
vector<int> vec = {1, 2, 3};
vector<int> vec(n, default_value);
vector<int> vec(arr, arr+n);    // from array

vec.push_back(value);
vac.pop_back();
vec.insert(vec.begin() + pos, value);

vec.size();     // int
vec.empty();    // bool

vec.erase(vec.begin() + pos);
vec.erase(vec.begin() + from, vec.begin() + till);
vec.clear();
vec.resize(size, val);  // val: optional

// Slicing a vector
// v1[i:j] | Note: j+1
v2 = vector<int> (v1.begin()+i, v1.begin()+j+1);

// v1[i:]
v2 = vector<int> (v1.begin()+i, v1.end());


// treversing
for(auto elt: vec)
    cout<<elt<<" ";

for(auto itr = vec.begin(); itr! = vec.end(); itr++)
    cout<<*itr<<" ";

// reverse traversing
// itr - reverse_iterator
for(auto itr = vec.rbegin(); itr! = vec.rend(); itr++)
    cout<<*itr<<" ";

vector<char> vec(str.begin(), str.end());   // string to vec of char

// combine vector A = A + B
A.reserve(B.size());  // not necessary; not sure if has any benefit
A.insert(A.end(), B.begin(), B.end());

// combine vector AB = A + B
AB.reserve(A.size()+B.size());  // not necessary; not sure if has any benefit
AB.insert(AB.end(), A.begin(), A.end());
AB.insert(AB.end(), B.begin(), B.end());

//
```

## Set

- elements are sorted in asc order
- you can have set with any structure, without specifying custom hash function
    - to achieve same with unordered_set, you need to give custom hash funtion

```cpp
set<int>myset = {1, 2, 3};

myset.insert(value);

myset.size();
myset.empty();

myset.find(value);     // pos itr else myset.end()
myset.count(value);    // 1 if present else 0
myset.erase(value);    // or myset.begin()+pos  // returns number of deleted elements, size_t, 0 if value not present
myset.clear();

set<vector<pair<int,int>>> uniqueIslands;   // valid, will need custom hash function with unordered_set

struct PairHash {
    size_t operator()(const pair<int, int> &p) const {
        return hash<int>()(p.first) ^ (hash<int>()(p.second) << 1);
        // OR something simple
        // return 31 * p.first + 37 * p.second; // 31, 37 are prime
    }
};
unordered_set<pair<int, int>, PairHash> myset;
```

**Unordered Set**

- faster

## Map

- ordered keys

```cpp
map<int, string> mymap;

mymap.insert(pair<int, string>(intVal, strVal));
mymap[key] = value;

// returns end itr if not found
map<int, string>::iterator x = mymap.find(key);

mymap.size();
mymap.empty();

mymap.erase(key);    // or itr
mymap.erase(startItr, endItr);

mymap.find(key)     // itr or mymap.end(), key=*itr.first, value=*itr.second
mymap.count(key)    // if key present => 1, else => 0   // better way to check key presence than find

// traversing
for(auto itr: m)
    cout<<itr.first<<" "<<itr.second<<"\n";

for(auto itr = m.begin(); itr!=m.end(); ++itr)
    cout<<(*itr).first<<" "<<(*itr).second<<"\n";

// reverse traversing
// itr - reverse_iterator
for(auto itr = m.rbegin(); itr!=m.rend(); ++itr)
    cout<<(*itr).first<<" "<<(*itr).second<<"\n";
```
**Unordered Map**

- faster
- no reverse iteration (no reverse trversal)

## Stack

```cpp
stack<int> stk;

stk.push(value);
stk.pop();    // doesn't return value   // may throw error if stack is empty
stk.top();                              // may throw error if stack is empty

stk.size();
stk.empty();

/* NOTE:
 * - stack don't have iterator
*/
```

## Queue

```cpp
queue<int> q;

q.push(value);     // Add to back
q.pop();           // Remove from front

q.front();         // Access front
q.back();          // Access back

q.size();          // Number of elements
q.empty();         // Check if empty

/* NOTE:
 * - queue don't have iterator
*/
```

## Dequeue

```cpp
deque<int> dq = {1,2,3};

dq.push_back(value);
dq.push_front(value);
dq.pop_back();
dq.pop_front();

// dq.size();
// dq.empty();

dq.front();
dq.back();
```

---

## Multiset

- stores elements in sorted order
- store dups
- modification not allowed

```cpp
multiset<int> ms = {1,2,3,3}

ms.insert(value);
// removes one occurence not all
ms.erase(value);
ms.erase(posItr);    // ms.erase(fromItr, toItr);

ms.size();
ms.empty();

ms.count(value);
ms.find(value);    // itr
```

## Multimap

- stores keys in sorted order
- store dup keys
- map-like insertion not possible

```cpp
multimap<int, string> mm;

mm.insert(pair<int, string>(key, value));
mm.erase(key);    // all entries
mm.erase(posItr);    // mm.erase(fromItr, toItr);

mm.size();
mm.empty();

mm.count(key);
mmt.find(key);    // itr
```

---

## Forward list | Singly linked list

```cpp
forward_list<int> ll;

ll.insert_after(itr, value);    // or (itr, count, value)

ll.push_front(value);

ll.pop_front();     // no return
ll.remove(value);   // all occurences

ll.erase_after(fromItr, toItr);

ll.front();
ll.empty();

// ll.before_begin();    // itr - head
```

## List | Doubly linked list

```cpp
list<int> dll;

dll.insert(posItr, value);    // or (posItr, count, value)
dll.push_front(value);
dll.push_back(value);

dll.pop_front();
dll.pop_back();
dll.remove(value);    // all occurences
dll.erase(posItr);    // or (fromItr, toItr)

dll.front();
dll.back();

dll.size();
dll.reverse();
dll.sort();
```

## Priority Queue | Heap

```cpp
priority_queue<int> maxHeap;
priority_queue<int, vector<int>, greater<int>> minHeap; // data type, underlying container,

maxHeap.push(val);
maxHeap.top();  // int
maxHeap.pop();  // void
maxHeap.empty();    // bool
maxHeap.size();     // int

// add all elements of a vector
maxHeap(vec.begin(), vec.end());
minHeap(vec.begin(), vec.end(), greater<int>());    // note "()" after greater<int>
```

## Bitset

```cpp
// N must be a compile-time constant (fixed size)
const int N = 8; // Example size

// Declaration and Initialization
bitset<N> b1;             // All N bits initialized to 0. Example: 00000000
bitset<N> b2(10);         // From unsigned long long integer. Example (N=8): 00001010 (binary for 10)
bitset<N> b3(string("1101")); // From std::string (right-aligned, padded with 0s). Example (N=8): 00001101
// Can also initialize from C-style string, or substring of std::string

// Accessing Bits
bool bit_val = b3.test(0); // Read bit at position 0 (rightmost). Returns bool. Bounds checked (throws std::out_of_range if pos >= N). Output: 1
bool bit_val_op = b3[0];   // Read bit using operator[]. Returns bool-like proxy. No bounds checking usually. Output: 1
// b3[1] = 0;             // Modify bit using operator[]. Example: b3 becomes 00001100

// Modification
b1.set();                // Set all bits to 1. Example: 11111111
b1.set(2);               // Set bit at position 3 to 1. Example: 11111011 -> 11111111
b1.set(2, false);        // Set bit at position 2 to 0. Example: 11111111 -> 11111011

b1.reset();              // Reset all bits to 0. Example: 11111011 -> 00000000
b1.reset(3);             // Reset bit at position 3 to 0. Example: 00001000 -> 00000000 (if b1 was 00001000)

b1.flip();               // Flip all bits (~ operator). Example: 00000000 -> 11111111
b1.flip(0);              // Flip bit at position 0. Example: 11111111 -> 11111110

// Querying
size_t num_bits = b1.size(); // Returns N (compile-time size). Output: 8
size_t set_bits = b1.count(); // Returns the number of set bits (1s).
bool any_set = b1.any();   // Returns true if at least one bit is set.
bool none_set = b1.none();  // Returns true if none of the bits are set.
bool all_set = b1.all();   // Returns true if all bits are set.

// Bitwise Operators (Member and Non-Member)
b1 &= b2; // Bitwise AND assignment
b1 |= b2; // Bitwise OR assignment
b1 ^= b2; // Bitwise XOR assignment

b1 <<= 2; // Left shift assignment
b1 >>= 1; // Right shift assignment

bitset<N> b4 = ~b1;     // Bitwise NOT
bitset<N> b5 = b1 & b2; // Bitwise AND
bitset<N> b6 = b1 | b2; // Bitwise OR
bitset<N> b7 = b1 ^ b2; // Bitwise XOR
bitset<N> b8 = b1 << 3; // Left shift
bitset<N> b9 = b1 >> 2; // Right shift

// Comparison
bool are_equal = (b1 == b2);
bool are_noteq = (b1 != b2);

// Conversion
string s = b1.to_string(); // Convert to binary string. Example: "11111110"
unsigned long ul = b1.to_ulong();       // Convert to unsigned long. Throws std::overflow_error if value doesn't fit.
unsigned long long ull = b1.to_ullong(); // Convert to unsigned long long. Throws std::overflow_error if value doesn't fit.
```

---

## Math

```cpp
#include <cmath>
```

| Method 		| Description 												 | Return Type
|---			|---														 |---
| fmax(x, y) 	| number with the highest value 							 | double/float/long double
| fmin(x, y) 	| number with the lowest value 								 | -//-
| .             |                                                            |
| abs(x)  		| and fabs(x), absolute value of x 							 | -//-
| pow(x, y) 	| value of x to the power of y 								 | -//-
| sqrt(x) 		| square root of x 											 | -//-
| cbrt(x) 		| cube root of x 											 | -//-
| hypot(x, y) 	| sqrt(x^2 +y^2) without intermediate overflow or underflow  | -//-
| .             |                                                            |
| floor(x) 		| value of x rounded down to its nearest integer 			 | -//-
| ceil(x) 		| value of x rounded up to its nearest integer 				 | -//-
| round(x) 		| value of x rounded to its nearest integer 				 | -//-
| trunc(x)      | removes digits after decimal point                         | -//-
| log(x) 		| natural logarithm (base E) of x 							 | -//-
| log10(x) 		| base 10 logarithm of x 									 | -//-
| log2(x) 		| base 2 logarithm of x 									 | -//-
| .				| 															 |
| sin(x) 		| sine of x (x is in radians) 								 | -//-
| sinh(x) 		| hyperbolic sine of a value     					    	 | -//-
| cos(x) 		| cosine of x (x is in radians) 							 | -//-
| cosh(x) 		| hyperbolic cosine of a value 			        			 | -//-
| tan(x) 		| tangent of an angle 										 | -//-
| tanh(x) 		| hyperbolic tangent of a value 			    			 | -//-


| Operator      | Symbol    | Form      | Operation
|---            |:-:        |:-:        |---
| left shift    | <<        | x << y    | all bits in x shifted left y bits
| right shift   | >>        | x >> y    | all bits in x shifted right y bits
| NOT           | ~         | ~x        | all bits in x flipped
| AND           | &         | x & y     | each bit in x AND each bit in y
| OR            | \|        | x \| y    | each bit in x OR each bit in y
| XOR           | ^         | x ^ y     | each bit in x XOR each bit in y


**Other concepts**

```cpp
#include <limits>
/* 
int - INT_MIN, INT_MAX, UINT_MAX, 
long long - LLONG_MIN, LLONG_MAX, ULLONG_MAX
*/
```

| Data Type 	| Size(bytes)| Range of Values
|---		    |:---:		 |---
| bool          | 1          | 0 or 1
| char 	        | 1  	     | -128 to 127
| unsigned char | 1          | 0 to 255
| short         | 2  	     | -32768 to 32767 `OR` -2<sup>15</sup> to 2<sup>15</sup> -1
| .             |            |
| int 	        | 4  	     | -2147483648 to 2147483647 `OR` -2<sup>31</sup> to 2<sup>31</sup> -1
| long 	        | 4  	     | -2147483648 to 2147483647 `OR` -2<sup>31</sup> to 2<sup>31</sup> -1
| long long     | 8  	     | -2<sup>63</sup> to 2<sup>63</sup> -1
| float 	    | 4  	     | ±3.4x10<sup>±38</sup>
| double 	    | 8  	     | ±1.7x10<sup>±308</sup>
| long double 	| 12         | ±1.1x10<sup>±4932</sup>

> **Data type modifiers available in C++ are:**
>
> - Signed
> - Unsigned
> - Short
> - Long
> 
> **Note:**
> - int == signed int == long == long int\
>   long long == long long int
> - ±3.4x10<sup>±38</sup> != -3.4x10<sup>-38</sup> to 3.4x10<sup>38</sup>\
>   Because, -3.4x10<sup>38</sup> is smaller than -3.4x10<sup>-38</sup>\
>   So, that's just a bad way to represent the range\
>   Similar is applicable for double, long double, etc.


## Type Conversion

```cpp
// float to int
int num1 = (int) float_value;


// int to string
string num2 = to_string(123);    // (int), part of <string>


// string to int, l, ll
// stoi, stol, stoll
int num2 = stoi("123");     // 123
int num2 = stoi("-123");    // -123
int num2 = stoi(" +123");   // 123

// string to int (faster than above method)
// #include <charconv>
string str = "123";
int num3;
from_chars(str.data(), str.data()+str.size(), num3);     // in place
```

---

## Structures

- Structure is a collection of variables of different data types under a single name

```cpp
struct Person {
    string name;
    int age;
};

// structure varriable and ptr
Person p1, *ptr

ptr = &p1;

p1.name = "John";
ptr->age = 25;

// ---

struct Person {
    string name;
    int age;

    // Constructor
    Person(string name, int age) : name(name), age(age) {}
};

Person p2("Roman", 23);
p2.age = 22;

// Dynamic (heap mem, not stack mem) allocation ==> need to cleanup
Person *ptr2 = new Person;  // OR Person *ptr2 = new Person{"AJ", 23};

delete ptr2;
```

## Tuple

- useful for returning multple value from a function (other options are pair, struct, vector, etc.)

```cpp
// declare and/ assign on same/seperate line
tuple<int, char, string> tp = make_tuple(10, 'a', "Hello");

cout<<get<0>(tp);  // access    // index need to be compile time contant
get<1>(tp) = 'b';  // modify

auto [num, ch, str] = tp;   // c++17
```

## Lambda Functions

Learn
    - How to define
    - Lambda captures
    - mutable keyword
    - use independently, in method/ function call

```cpp
// can simly use "auto"
function<bool(int, int&)> cmp = [](int a, int &b) {
    return a < b;
};
cmp(2, 3);   // true


// Capture
// - capture value is by default const (though if it's capture ref, you can use that pointer to modify outside value but can't modify pointer itself)
int x = 10;
auto f1 = [x](int y) { return x + 1; };     // capture by value (copy) // if later x is changed outside, still it will use old x
auto f2 = [&x](int y) { return x + 1; };    // capture by ref


// mutable: if you want to modify capture value, and don't want to affect original/outside value
// so next you call this lambda, it will see modified value (remember, outside x is not modified), lambda's copy of x is modified
function<int()> f3 = [x]() mutable {
    x++;
    return x;
};

```
