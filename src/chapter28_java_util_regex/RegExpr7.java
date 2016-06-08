package chapter28_java_util_regex;

import java.util.regex.*;

class RegExpr7 {
	public static void main(String args[]) {
		// Match lowercase words.
		Pattern pat = Pattern.compile("[a-z]+");
		Matcher mat = pat.matcher("this is a test.");

		while (mat.find())
			System.out.println("Match: " + mat.group());
	}
}