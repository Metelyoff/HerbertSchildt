package chapter6_classes;

class TastStack {
	public static void main(String[] args) {
		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack();
		Stack myStack3 = new Stack();
		Stack myStack4 = new Stack();

		for (int i = 0; i < 10; i++)
			myStack1.push(i);

		for (int i = 10; i < 20; i++)
			myStack2.push(i);

		for (int i = 10; i < -1; --i)
			myStack3.push(i);

		System.out.println("The stack in myStack1 is");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack1.pop());

		System.out.println("The stack in myStack2 is");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack2.pop());

		System.out.println("The stack in myStack3 is");
		for (int i = 0; i < 1; i++)
			myStack3.pop();

		System.out.println("The stack in myStack4 is");
		for (int i = 0; i < 11; i++)
			myStack4.push(i);
	}
}
