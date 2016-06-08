package chapter5_control_statements;

class NoBody {
	public static void main(String[] args) {
		int i, j;
		i = 100;
		j = 200;
		while (++i < --j)
			;
		System.out.println(i);
		System.out.println(j);
	}
}
