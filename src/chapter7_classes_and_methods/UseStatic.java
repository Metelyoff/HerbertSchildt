package chapter7_classes_and_methods;

class UseStatic {

	static int a = 3;
	static int b;

	static void meth(int x) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("x = " + x);
	}

	static {
		System.out.println("The static block is ranning!");
		b = a * 4;
	}

	public static void main(String[] args) {
		meth(42);
	}
}
