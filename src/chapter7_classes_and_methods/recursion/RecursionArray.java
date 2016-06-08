package chapter7_classes_and_methods.recursion;

class RecursionArray {
	int values[];

	RecursionArray(int i) {
		values = new int[i];
	}

	void printArray(int i) {
		if (i == 0)
			return;
		else
			printArray(i - 1);
		System.out.println("[" + (i - 1) + "] " + values[i - 1]);
	}
}
