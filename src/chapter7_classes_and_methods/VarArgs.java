package chapter7_classes_and_methods;

class VarArgs {
	static void passArray(int... v) {
		System.out.print("Length arguments = " + v.length + " numbers: ");

		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		passArray(0, 9, 8, 7, 6, 5);
		passArray(5643);
		passArray();

	}
}
