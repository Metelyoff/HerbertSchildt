package chapter7_classes_and_methods;

class StringMethods {
	public static void main(String[] args) {
		String str1 = "one";
		String str2 = "two";
		String str3 = str1;

		System.out.println("str1 length = " + str1.length());
		System.out.println("str2 index 2 = " + str2.charAt(2));

		if (str1.equals(str2))
			System.out.println("str1 == str2");
		else
			System.out.println("str1 != str2");
		if (str1.equals(str3))
			System.out.println("str1 == str3");
		else
			System.out.println("str1 != str3");
	}
}
