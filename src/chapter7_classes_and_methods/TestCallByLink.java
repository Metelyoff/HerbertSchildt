package chapter7_classes_and_methods;

class TestCallByLink {
	public static void main(String[] args) {
		CallByLink cbl = new CallByLink(15, 20);
		System.out.println("before calling cbl.a and cbl.b " + cbl.a + " " + cbl.b);
		cbl.meth(cbl);
		System.out.println("after call cbl.a and cbl.b " + cbl.a + " " + cbl.b);
	}
}
