package chapter5_control_statements;

public class ForEachSearch {
	public static void main(String[] args) {
		int nums[] = { 1, 5, 3, 8, 2, 4, 9, 0, 6, 7 };
		int val = 11;
		boolean found = false;
		for (int x : nums) {
			if (x == val) {
				found = true;
				break;
			} else
				found = false;
		}
		System.out.println(found);
		/*
		 * if (found == true) { System.out.println("founded"); } else
		 * System.out.println("not found");
		 */
	}
}