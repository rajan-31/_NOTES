For more check [https://cplusplus.com/reference](https://cplusplus.com/reference/)

*abbreviations:* itr -> Iterator, ds -> Data Structure, ptr -> pointer.


## Libs

```cpp
#include <algorithm>

sort(beginItr, endItr);

// for itr => *itr gives index
lower_bound(beginItr, endItr, value);    // itr of equal or just greater value
upper_bound(beginItr, endItr, value);    // itr of just greater value or itr end
max_element(beginItr, endItr);           // itr of max elt
fill(beginItr, endItr, value);
reverse(beginItr, endItr);  // in-place

swap(item1, item2)    // item: array elt, whole array, vector. eg. swap(arr[0], arr[1]); swap(arr1, arr2);


#include <vector>
/* similarly array, map, unordered_map, etc. */

#include <cmath>
/*  */

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

// str.size();    // str.length();

str.insert(pos, value);
str.append(value);
str.replace(start_pos, len, value);

str.substr(start_pos, end_pos);

str.find(value);    // index else string::npos
str.find(value, start_pos);    // index else string::npos
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
| `				| 															 |
| sin(x) 		| sine of x (x is in radians) 								 | -//-
| sinh(x) 		| hyperbolic sine of a value     					    	 | -//-
| cos(x) 		| cosine of x (x is in radians) 							 | -//-
| cosh(x) 		| hyperbolic cosine of a value 			        			 | -//-
| tan(x) 		| tangent of an angle 										 | -//-
| tanh(x) 		| hyperbolic tangent of a value 			    			 | -//-

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
| short         | 2  	     | -32768 to 32767
| `             |            |
| int 	        | 4  	     | -2147483648 to 2147483647
| long 	        | 4  	     | -2147483648 to 2147483647
| long long     | 8  	     | -2<sup>63</sup> to 2<sup>63</sup> -1
| float 	    | 4  	     | 3.4<sup>-38</sup> to 3.4<sup>38</sup>
| double 	    | 8  	     | 1.7<sup>-308</sup> to 1.7<sup>308</sup>
| long double 	|            | 

> **Data type modifiers available in C++ are:**
>
> - Signed
> - Unsigned
> - Short
> - Long
> 
> **Note:**\
> int = signed int = long = long int\
> long long = long long int

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
