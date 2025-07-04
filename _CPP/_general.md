- [Heap memory and stack memory](https://www.geeksforgeeks.org/stack-vs-heap-memory-allocation/)

- ``ptr->data`` is same as ``(*ptr).data``
    
    Because the "." operator has a higher precedence than the "*" operator. Hence, we enclose *ptr in brackets when using (*ptr).data

- Set & unset flag to print boolean values as "true", "false"
    `cout<<boolalpha;`
    `cout<<noboolalpha;`

- n = 5
    i < n/2 ==> i < 2.5 (and not i < 2)
    so it will accept i = 0, 1, 2
    so you need to type cast it

- vector of char to string
    `string str(charVec.begin(), charVec.end());`


- vector of int to string
    `for (int num : intVec) str += to_string(num);`


- vector of ascii to string
    ```cpp
    string str;
    for (int num : intVec) str += static_cast<char>(num);
    ```

- js like map
    ```cpp
    vector<int> nums = {1, 2, 3, 4};
    vector<int> squared(nums.size());
    transform(nums.begin(), nums.end(),
        squared.begin(),
        [](int x) { return x * x; }
    );
    ```

- js like filter
    ```cpp
    vector<int> nums = {1, 2, 3, 4, 5};
    vector<int> evens;

    copy_if(nums.begin(), nums.end(),
        back_inserter(evens),  // because not preallocated mem like map example
        [](int x) { return x % 2 == 0; }
    );
    ```

- `size_t` used for unsigned integers that represent sizes and indices
    - generally used for container sizes (eg. vector.size(), etc.)
    - its size depends on platform
        - It matches the platform's address space
        - 32-bit platform => 32-bit (4 byte)
        - 64-bit platform => 64-bit (8 byte)
    - unlike double, long long, unsigned long long have same size and range
    - It's guaranteed to be large enough to index any array
    - It's essentially tied to the platform's pointer size
