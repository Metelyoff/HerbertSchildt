package chapter5_control_statements;

class Return {
	public static void main(String[] args) {
		boolean t = true;
		System.out.print("before return");
		if (t)
			return;
		System.out.println("after return");
	}
}
