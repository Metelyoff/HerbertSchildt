package chapter5_control_statements;

class GoToBreak {
	public static void main(String[] args) {
		boolean t = true;
		one: {
			two: {
				three: {
					System.out.println("three");
					if (t)
						break two;
					System.out.println("after break");
				}
				System.out.println("two");
			}
			System.out.println("one");
		}
	}
}
