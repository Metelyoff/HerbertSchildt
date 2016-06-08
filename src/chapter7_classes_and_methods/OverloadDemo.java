package chapter7_classes_and_methods;

class OverloadDemo {
	void test() {
		System.out.println("The parameters is empty");
	}

	void test(int a) {
		System.out.println("a is " + a);
	}

	void test(int a, int b) {
		System.out.println("a and b is " + a + " and " + b);
	}

	double test(double a) {
		System.out.println(a);
		return a * a;
	}
}
