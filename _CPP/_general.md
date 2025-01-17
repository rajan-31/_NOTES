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
