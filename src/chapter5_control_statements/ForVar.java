package chapter5_control_statements;

class ForVar {
	public static void main(String[] args) {
		int i;
		boolean done;
		i = 0;
		done = false;
		for (; !done;) {
			System.out.println(i);
			if (i == 10)
				done = true;
			i++;
		}
	}
}
