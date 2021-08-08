# Creating Format Strings
	
```java
System.out.printf("go %f %d %s", floatVar, intVar, stringVar);	// PrintStream 

String fs;
fs = String.format("go %f %d %s", floatVar, intVar, stringVar);	// String
```


# Primitive Data Types 

It means predefined (already defined) in Java.

A primitive data type specifies the size and type of variable values, and it has no additional methods.

There are eight primitive data types in Java:

|Data Type 	|Size 		|Description
|---		|---		|---
|byte 		|1 byte 	|-128 to 127
|short 		|2 bytes 	|-32,768 to 32,767
|int 		|4 bytes 	|-2,147,483,648 to 2,147,483,647
|long 		|8 bytes 	|-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
|float 		|4 bytes 	|Sufficient for storing 6 to 7 decimal digits
|double 	|8 bytes 	|Sufficient for storing 15 decimal digits
|boolean 	|1 bit 		|Stores true or false values
|char 		|2 bytes 	|Stores a single character/letter or ASCII values

Primitive number types are divided into two groups:
- Integer types: byte, short, int, long
- Floating point types: float, double

__Additional info__
- Float: 3.4e−038 to 3.4e+038
	+ end the value with an "f"
	+ ``float myNum = 5.75f;``

- Double: 1.7e−308 to 1.7e+308
	+ end the value with a "d"
	+ ``double myNum = 19.99d;``

- A floating point number can also be a scientific number with an "e" or "E" to indicate the power of 10
	+ `float f1 = 35e3f;`
- The character must be surrounded by single quotes
	+ Alternatively, you can use ASCII values to display certain characters
	+ `char a = 65;		// it will print "A"`

# Non-primitive Data Types

It means created by the programmer and is not defined by Java (except for String).

- String, Arrays, Classes, Interfaces, etc.
- Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
- A primitive type has always a value, while non-primitive types can be null.
- A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
- The size of a primitive type depends on the data type, while non-primitive types have all the same size.

# Type Casting


- Widening Casting (automatically) - converting a smaller type to a larger type size

	byte -> short -> char -> int -> long -> float -> double

	```java
	int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double
	```

- Narrowing Casting (manually) - converting a larger type to a smaller size type

	double -> float -> long -> int -> char -> short -> byte
	```java
	double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int
	```