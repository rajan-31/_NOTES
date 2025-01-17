- Member Initialization Lists:

	Used in constructors to initialize class members directly.
	Syntax: member_name : expression

	```cpp
	#include <iostream>

	class MyClass {
	public:
		// member_name : expression
	    MyClass(int x, int y) : a(x), b(y) {

	    }

	    void printValues() {
	        std::cout << "a = " << a << ", b = " << b << std::endl;
	    }

	private:
	    int a, b;
	};

	int main() {
	    MyClass obj(10, 20);
	    obj.printValues();  // a = 10, b = 20

	    return 0;
	}
	```
