package chapter8_inheritance.superword;

class B extends A {
	int i;

	B(int a, int b) {
		super.i = a;
		i = b;
	}

	void show() {
		System.out.println("i in the super class " + super.i);
		System.out.println("i in the sub class " + i);
	}
}
