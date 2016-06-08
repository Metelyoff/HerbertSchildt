package chapter7_classes_and_methods;

class vaTest {

	static void passArray(int v[]) {
		System.out.print("Length arguments = " + v.length + " numbers: ");

		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int n1[] = { 1, 2, 3 };
		int n2[] = { 89 };
		int n3[] = {};

		passArray(n1);
		passArray(n2);
		passArray(n3);
	}
}
