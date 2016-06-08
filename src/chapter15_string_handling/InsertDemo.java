package chapter15_string_handling;

//Demonstrate insert().
class InsertDemo {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("I Java!");

		sb.insert(2, "like ");
		System.out.println(sb);
	}
}