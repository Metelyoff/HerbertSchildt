package chapter8_inheritance.overloadMethods;

class OverrideClassB {
	public static void main(String[] args) {
		B b = new B(1, 2, 3);
		b.show("This is k = ");
		b.show();
	}
}