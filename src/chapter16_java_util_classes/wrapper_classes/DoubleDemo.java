package chapter16_java_util_classes.wrapper_classes;

class DoubleDemo {
	public static void main(String args[]) {
		Double d1 = new Double(3.14159);
		Double d2 = new Double("314159E-5");

		System.out.println(d1 + " = " + d2 + " -> " + d1.equals(d2));
	}
}