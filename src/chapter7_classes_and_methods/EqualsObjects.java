package chapter7_classes_and_methods;

class EqualsObjects {
	public static void main(String[] args) {

		TestEquals te1 = new TestEquals(5, 8);
		TestEquals te2 = new TestEquals(5, 8);
		TestEquals te3 = new TestEquals(-4, -7);

		System.out.println("te1==te2 is " + te1.equals(te2));
		System.out.println("te1==te3 is " + te1.equals(te3));
	}
}
