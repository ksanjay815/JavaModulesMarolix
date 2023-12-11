package Module4.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {
	public static void main(String[] args) {
		// another method to add details step 1

		// LinkedHashSet<String> ar = new
		// LinkedHashSet<String>(Arrays.asList("Dhoni","virat"));

		LinkedHashSet<String> s = new LinkedHashSet<String>();
		s.add("sanjay");
		s.add("    kumar    ");
		s.add("sad");
		s.add("qwe");
		s.add("gtu");
		s.add("fdr");
		System.out.println(s);
		// Collections.sort(s);
		// System.out.println(s.get(2)); // ar.getindex() to select particular data
		// System.out.println(s.get(1).trim()); // to remove spaces before and after
		System.out.println(s.size());
		System.out.println(s.size() - 1); // to get the index size
		s.add("sanjay"); // duplicate entry it will not show compile error but not allow duplicate data
							// to print
		s.add("sanjay");// it will not show compile error but not allow duplicate data to print
		System.out.println(s);
		for (String aaa : s) {
			if (aaa == "sad") { // if(aaa.equals("sad"))
				System.out.println(aaa);
			}
		}
	}
}
