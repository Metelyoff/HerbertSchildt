package chapter8_inheritance.inheritance;

class TestInheritance {

	public static void main(String[] args) {
		A superOb = new A();
		B subOb = new B();

		superOb.i = 10;
		superOb.j = 20;
		System.out.println("superOb contens: ");
		superOb.showij();
		System.out.println();

		subOb.i = 1;
		subOb.j = 2;
		subOb.k = 3;
		System.out.println("subOb contens: ");
		subOb.showij();
		subOb.showk();

		System.out.println();
		System.out.println("Sum i,j and k in subOb: ");
		subOb.sum();
	}
}
