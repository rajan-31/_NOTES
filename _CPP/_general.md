- ``ptr->data`` is same as ``(*ptr).data``
    
    Because the "." operator has a higher precedence than the "*" operator. Hence, we enclose *ptr in brackets when using (*ptr).data

- Set & unset flag to print boolean values as "true", "false"
    `cout<<boolalpha;`
    `cout<<noboolalpha;`

