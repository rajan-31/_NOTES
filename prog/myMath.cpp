#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
	long double a=4.222222222;
	long double b=4.222222223;
	long double x=fmax(a,b);
	cout<<to_string(x)<<endl;

	return 0;
}