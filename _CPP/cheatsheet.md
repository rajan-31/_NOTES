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

swap(item1, item2);    // item: array elt, whole array, vector. eg. swap(arr[0], arr[1]); swap(arr1, arr2);

// They return end itr if no value found or no predicate match
find(firstItr, lastItr, value);     // returns itr to first occurence
// predicate is boolean function with input as value
find_if(firstItr, lastItr, predicate);  // return itr when predicate is true first time
find_if_not(firstItr, lastItr, predicate);  // return itr when predicate is false first time

// can use constant itr, since no modification of value happens
binary_search(firstItr, lastItr, value);    // returns true/false

// a,b,c,d,e
// takes advantage of parallalization ==> (a+b) + (c+d) + e
int summ = reduce((firstItr, lastItr);    // if elts are float return value will be float
// does left folding ==> (((((a)+b)+c)+d)+e)
int summ = accumulate((firstItr, lastItr, init_value);    // return value type depends on "init_value" type

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

str.replace(start_pos, len, value);

str.substr(start_pos, end_pos+1);
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

```cpp
set<int>myset = {1, 2, 3};

myset.insert(value);

myset.size();
myset.empty();

myset.find(value);     // pos itr else myset.end()
myset.count(value);    // 1 if present else 0
myset.erase(value);    // or myset.begin()+pos
myset.clear();
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

## Dequeue

```cpp
deque<int> dq = {1,2,3};

dq.push_back(value);
dq.push_front(value);
dq.pop_back();
dq.pop_front();

// dq.size();
// dq.empty;

dq.front();
dq.back();
```

## Stack

```cpp
stack<int> stk;

stk.push(value);
stk.pop();    // doesn't return value
stk.top();

stk.size();
stk.empty();
```

---

## Multiset

- stores elements in sorted order
- store dups
- modification not allowed

```cpp
multiset<int> ms = {1,2,3,3}

ms.insert(value);
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

ll.pop_front();
ll.remove(value);    // all occurences

ll.erase_after(fromItr, toItr);

ll.front();

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

dll.reverse();
dll.sort();
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
| `             |                                                            |
| abs(x)  		| and fabs(x), absolute value of x 							 | -//-
| pow(x, y) 	| value of x to the power of y 								 | -//-
| sqrt(x) 		| square root of x 											 | -//-
| cbrt(x) 		| cube root of x 											 | -//-
| hypot(x, y) 	| sqrt(x^2 +y^2) without intermediate overflow or underflow  | -//-
| `             |                                                            |
| floor(x) 		| value of x rounded down to its nearest integer 			 | -//-
| ceil(x) 		| value of x rounded up to its nearest integer 				 | -//-
| round(x) 		| value of x rounded to its nearest integer 				 | -//-
| trunc(x)      | removes digits after decimal point                         | -//-
| log(x) 		| natural logarithm (base E) of x 							 | -//-
| log10(x) 		| base 10 logarithm of x 									 | -//-
| log2(x) 		| base 2 logarithm of x 									 | -//-
| `				| 															 |
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
| OR            | |         | x | y     | each bit in x OR each bit in y
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
| ---		    | :---:		 | ---
| bool          | 1          | 0 or 1
| char 	        | 1  	     | -128 to 127
| unsigned char | 1          | 0 to 255
| short         | 2  	     | -32768 to 32767 `OR` -2<sup>15</sup> to 2<sup>15</sup> -1
| `             |            |
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

// string to int (fasterthan above method)
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
    // something
};

// structure var and ptr
Person john, *ptr
```

## Tuple

- useful for returning multple value from a function (other options are pair, struct, vector, etc.)

```cpp
// declare and/ assign on same/seperate line
tuple<int, char, string> tp = make_tuple(10, 'a', "Hello");

cout<<get<0>(tp);  // access
get<1>(tp) = 'b';  // modify
```

## Lambda Functions

Learn
    - How to define
    - Lambda captures
    - mutable keyword
    - use independently, in method/ function call
