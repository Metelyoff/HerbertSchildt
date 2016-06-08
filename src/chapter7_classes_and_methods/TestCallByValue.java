package chapter7_classes_and_methods;

class TestCallByValue {
	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		int a = 15;
		int b = 10;
		System.out.println("before call " + a + " " + b);
		cbv.meth(a, b);
		System.out.println("after call " + a + " " + b);
	}
}
