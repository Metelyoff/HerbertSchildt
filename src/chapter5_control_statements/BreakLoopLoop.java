package chapter5_control_statements;

class BreakLoopLoop {
	public static void main(String[] args) {
		outer: for (int i = 1; i < 10; i++) {
			System.out.print("Loop " + i + ": ");
			for (int j = 1; j < 10; j++) {
				if (i == 5)
					break outer;
				System.out.print(j + " ");
			}
			System.out.println("first loop");
		}
		System.out.println("end loop");
	}
}
