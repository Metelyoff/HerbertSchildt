package chapter28_java_util_regex;

import java.util.regex.*;

class RegExpr4 {
	public static void main(String args[]) {
		Pattern pat = Pattern.compile("W+");
		Matcher mat = pat.matcher("W WW WWW");

		while (mat.find())
			System.out.println("Match: " + mat.group());
	}
}