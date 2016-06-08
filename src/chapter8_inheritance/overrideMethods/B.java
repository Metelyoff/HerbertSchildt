package chapter8_inheritance.overrideMethods;

class B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	void show() {
		super.show();
		System.out.println("k = " + k);
	}
}