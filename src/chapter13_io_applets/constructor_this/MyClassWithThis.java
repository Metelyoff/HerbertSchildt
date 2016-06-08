package chapter13_io_applets.constructor_this;

class MyClassWithThis {
	int a;
	int b;

	// initialize a and b individually
	MyClassWithThis(int i, int j) {
		a = i;
		b = j;
	}

	// initialize a and b to the same value
	MyClassWithThis(int i) {
		this(i, i); // invokes MyClass(i, i)
	}

	// give a and b default values of 0
	MyClassWithThis() {
		this(0); // invokes MyClass(0)
	}
}
