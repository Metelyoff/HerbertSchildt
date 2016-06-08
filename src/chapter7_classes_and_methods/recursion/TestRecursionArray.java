package chapter7_classes_and_methods.recursion;

class TestRecursionArray {
	public static void main(String[] args) {
		RecursionArray ra = new RecursionArray(10);
		int i;
		for (i = 0; i < 10; i++)
			ra.values[i] = i;
		ra.printArray(10);
	}
}
