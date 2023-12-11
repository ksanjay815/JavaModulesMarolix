package Module4.Collections;

import java.util.ArrayList;

public class Array_List {
	public static void main(String[] args) {
		// another method to add details step 1
		
		// ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Dhoni","virat"));
		
		// another method to add details step 2
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("sanjay");
		ar.add("    kumar    ");
		ar.add("sad");
		ar.add("qwe");
		ar.add("gtu");
		ar.add("fdr");
		System.out.println(ar);
		// Collections.sort(ar);
		System.out.println(ar.get(2)); // ar.getindex() to select particular data
		System.out.println(ar.get(1).trim()); // to remove spaces before and after
		System.out.println(ar.size());
		System.out.println(ar.size() - 1); // to get the index size
		ar.remove(1);
		System.out.println(ar);

	}
}
