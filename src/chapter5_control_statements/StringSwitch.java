package chapter5_control_statements;

class StringSwitch {

	public static void main(String[] args) {
		String str = "two";
		switch (str) {
		case "one":
			System.out.println("1");
			break;
		case "two":
			System.out.println("2");
			break;
		case "three":
			System.out.println("3");
			break;
		default:
			System.out.println("not search");
		}
	}

}
