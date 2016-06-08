package chapter7_classes_and_methods.recursion;

class TestFactorial {
	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.fac(3));
		System.out.println(f.fac(4));
		System.out.println(f.fac(5));
		System.out.println(f.fac(6));
	}
}
