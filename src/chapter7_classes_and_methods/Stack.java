package chapter7_classes_and_methods;

class Stack {
	private int stck[] = new int[10];
	private int tos;

	Stack(int size) {
		stck = new int[size];
		tos = -1;
	}

	void push(int item) {
		if (tos == stck.length - 1)
			System.out.println("The stack is full!");
		else
			stck[++tos] = item;
	}

	int pop() {
		if (tos < 0) {
			System.out.println("The stack is empty!");
			return 0;
		} else
			return stck[tos--];
	}
}
