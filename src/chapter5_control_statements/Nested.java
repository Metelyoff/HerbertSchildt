package chapter5_control_statements;

class Nested {
	public static void main(String[] args) {
		int i, j;
		for (i = 0; i < 20; i++) {
			for (j = i; j < 20; j++)
				System.out.print("+");
			System.out.println();
		}
	}
}
