package chapter9;

class AccountBalance {
	public static void main(String args[]) {
		Balance b[] = new Balance[3];
		b[0] = new Balance("Vasya", 50.6);
		b[1] = new Balance("Petya", 560.6);
		b[2] = new Balance("Valdemar", -50.6);

		for (int i = 0; i < b.length; i++)
			b[i].show();
	}
}
