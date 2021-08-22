### Libs

```cpp
#include <bits/stdc++.h>
/* includes every standard library */

#include <algorithm>
/*
sort(beginItr, endItr)
lower_bound(beginItr, endItr, value)    // itr of equal or just greater value
upper_bound(beginItr, endItr, value)    // itr of just greater value or itr end
fill(beginItr, endItr, value)

swap(ds1, ds2)    // eg. vector1, vector2
*/

#include <vector>
/* array, map, unordered_map, etc. */
```

### Other

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
```

### Array

- passing array name w/o index to a function passes ptr by default

**Ordinary static C style array**

```cpp
int arr[n] = {1 ,2 ,3};
int arr[] = {1 ,2 ,3};

// size
int n = sizeof(arr)/sizeof(arr[0]);    // works even w/o array initialization

// sort - algorithms
sort(arr, arr+n);

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

### String

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

### Vector

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

// treversing
for(auto elt: vec)
    cout<<elt<<" ";

for(auto itr = vec.begin(); itr! = vec.end(); itr++)
    cout<<*itr<<" ";

// reverse traversing
// itr - reverse_iterator
for(auto itr = vec.rbegin(); itr! = vec.rend(); itr++)
    cout<<*itr<<" ";
```

### Set

- element are sorted in asc order

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

### Map

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

### Dequeue

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

### Stack

```cpp
stack<int> stk;

stk.push(value);
stk.pop();    // doesn't return value
stk.top();

stk.size();
stk.empty();
```

---

### Multiset

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

### Multimap

- stores keys in sorted order
- store dup keys

```cpp
multimap<int, string> mm;

mm.insert(pair<int, string>(key, value));
mm.erase(key);    // all entries
mm.erase(posItr);    // mm.erase(fromItr, toItr);

mm.size();
mm.empty();

mm.count(key);
ms.find(key);    // itr
```

---

### Forward list | Singly linked list

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

### List | Doubly linked list

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