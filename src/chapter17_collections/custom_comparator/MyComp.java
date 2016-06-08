package chapter17_collections.custom_comparator;

import java.util.*;

//A reverse comparator for strings.  
class MyComp implements Comparator<String> {
	public int compare(String a, String b) {
		String aStr, bStr;

		aStr = a;
		bStr = b;

		// Reverse the comparison.
		return bStr.compareTo(aStr);
	}

	// No need to override equals.
}