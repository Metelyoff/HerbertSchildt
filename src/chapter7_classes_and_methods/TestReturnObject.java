package chapter7_classes_and_methods;

class TestReturnObject {
	public static void main(String[] args) {

		ReturnObject ro1 = new ReturnObject(2);
		ReturnObject ro2;

		ro2 = ro1.meth();
		System.out.println("ro1.a = " + ro1.a);
		System.out.println("ro2.a = " + ro2.a);
		ro2 = ro2.meth();
		System.out.println("ro2.a = " + ro2.a);
		ro2 = ro2.meth();
		System.out.println("ro2.a = " + ro2.a);
	}
}
