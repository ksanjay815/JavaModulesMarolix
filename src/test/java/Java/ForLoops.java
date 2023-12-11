package Java;

public class ForLoops {

	public static void main(String[] args) {
	
		// For-Loop to print 1 to 10 numbers
		
		for(int i=1;i<=10;i++) {
			System.out.print(" " +i);
			System.out.println(" i am sanjay");
		}
	
		/*
		 * // post increment int a=4,b,c;
		 *  a=a++; 
		 *  b=a++; 
		 *  a++; 
		 *  System.out.println(b);
		 * System.out.println(a);
		 */

	// pre increment
	int a=4,b,c;
	a=++a;
	b=++a;
	++a;
	System.out.println(b);
	System.out.println(a);
}
}