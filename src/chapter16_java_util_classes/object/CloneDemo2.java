package chapter16_java_util_classes.object;

class CloneDemo2 {
	public static void main(String args[]) {
		OverrideTestClone x1 = new OverrideTestClone();
		OverrideTestClone x2;

		x1.a = 10;
		x1.b = 20.98;

		// here, clone() is called directly.
		x2 = (OverrideTestClone) x1.clone();

		System.out.println("x1: " + x1.a + " " + x1.b);
		System.out.println("x2: " + x2.a + " " + x2.b);
	}
}