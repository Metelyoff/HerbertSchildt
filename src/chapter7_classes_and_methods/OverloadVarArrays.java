package chapter7_classes_and_methods;

class OverloadVarArrays {

	static void passArray(int... v) {
		System.out.print("Int Length arguments = " + v.length + " numbers: ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	static void passArray(boolean... v) {
		System.out.print("Boolean Length arguments = " + v.length + " numbers: ");
		for (boolean x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	static void passArray(String msg, int... v) {
		System.out.print("String and Integer Length arguments = " + msg + v.length + " numbers: ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		passArray(1, 2, 3, 4, 5);
		passArray("test ", 1, 2, 3, 4, 5);
		passArray(true, false, true, false);
	}
}
