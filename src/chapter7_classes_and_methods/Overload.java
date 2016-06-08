package chapter7_classes_and_methods;

class Overload {
	public static void main(String[] args) {
		OverloadDemo od = new OverloadDemo();
		double res;
		od.test();
		od.test(10);
		od.test(1, 2);
		res = od.test(1.8);
		System.out.println("result a*a= " + res);
	}
}
