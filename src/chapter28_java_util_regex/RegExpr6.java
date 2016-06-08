package chapter28_java_util_regex;

import java.util.regex.*;

class RegExpr6 {
	public static void main(String args[]) {
		// Use reluctant matching behavoir.
		Pattern pat = Pattern.compile("e.+?d");
		Matcher mat = pat.matcher("extend cup end table");

		while (mat.find())
			System.out.println("Match: " + mat.group());
	}
}