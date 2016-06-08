package chapter8_inheritance.nested;

class NestedIfDemo {
	public static void main(String[] args) {
		A.NestedIf nes = new B();
		if (nes.notNegative(10))
			System.out.println("10>0");
		if (nes.notNegative(-3))
			System.out.println("-3<0");
	}

}