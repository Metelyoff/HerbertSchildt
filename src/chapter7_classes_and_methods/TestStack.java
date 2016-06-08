package chapter7_classes_and_methods;

class TestStack {
	public static void main(String[] args) {
		Stack myStack1 = new Stack(10);
		Stack myStack2 = new Stack(15);

		for (int i = 0; i < 10; i++)
			myStack1.push(i);

		for (int i = 0; i < 15; i++)
			myStack2.push(i);

		System.out.println("The stack in myStack1 is");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack1.pop());

		System.out.println("The stack in myStack2 is");
		for (int i = 0; i < 15; i++)
			System.out.println(myStack2.pop());
	}
}
