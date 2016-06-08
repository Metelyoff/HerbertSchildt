package chapter7_classes_and_methods;

class MsgVarArgs {

	static void passArray(String msg, int... v) {
		System.out.print(msg + v.length + " numbers: ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		passArray("one parameter ", 587);
		passArray("three parameters ", 1, 2, 3);
		passArray("null parameter ");
	}
}
