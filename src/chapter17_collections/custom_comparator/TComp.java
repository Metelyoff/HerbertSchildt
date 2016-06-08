package chapter17_collections.custom_comparator;

import java.util.*;

//Compare last whole words in two strings.  
class TComp implements Comparator<String> {
	public int compare(String a, String b) {
		int i, j, k;
		String aStr, bStr;

		aStr = a;
		bStr = b;

		// Find index of beginning of last name.
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');

		k = aStr.substring(i).compareTo(bStr.substring(j));
		if (k == 0) // last names match, check entire name
			return aStr.compareTo(bStr);
		else
			return k;
	}

	// No need to override equals.
}