package chapter8_inheritance.inheritance;

class AccountBalance {
	public static void main(String[] args) {

		Balance current[] = new Balance[3];

		current[0] = new Balance("Tokranov S.S. ", 15000.50);
		current[1] = new Balance("Metelyov D.Yu. ", 2500.01);
		current[2] = new Balance("Nulyovkin V.V. ", -3500.0);

		for (int i = 0; i < 3; i++)
			current[i].show();

	}
}