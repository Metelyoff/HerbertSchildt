package chapter8_inheritance.interfaces;

class DynStack implements IntStack {

	private int stck[];
	private int tos;

	// rezervation and initialization of steck
	DynStack(int size) {
		stck = new int[size];
		tos = -1;
	}

	// push the element in the steck
	public void push(int item) {
		if (tos == stck.length - 1) {
			int temp[] = new int[stck.length * 2];
			for (int i = 0; i < stck.length; i++)
				temp[i] = stck[i];
			stck = temp;
			stck[++tos] = item;
		} else
			stck[++tos] = item;
	}

	public int pop() {
		if (tos < 0) {
			System.out.println("Stack is empty");
			return 0;
		} else
			return stck[tos--];
	}
}
