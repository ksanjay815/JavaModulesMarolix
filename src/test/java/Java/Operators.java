package Java;

public class Operators {

	public static void main(String[] args) {

		System.out.println("my name is sanjay");
		/*
		 * int a=45; float r=65.234567f; // in float we can use upto 6 digits after
		 * decimal char c='t'; long k = 987445356345371l; // always end with L or l
		 * short s =129; // max no it will take is 32767 & min is -32768 byte b=127; //
		 * max no it will take is 127 & min is -128 double d = 567.345677454467755; //
		 * it can also be end with D or d boolean today = true; boolean tomorrow =
		 * false; String Q ="Sanjay";
		 * 
		 * System.out.println("Hi welcome to my world");
		 * 
		 * System.out.println(a); System.out.println(r); System.out.println(c);
		 * System.out.println(k); System.out.println(s); System.out.println(b);
		 * System.out.println(d); System.out.println(today);
		 * System.out.println(tomorrow); System.out.println(Q);
		 * 
		 */// Arithmetic Operators + - / *
			// Assignment Operators =
			// Comparision Operators ==
			// Concatination Operators
			// System.out.println("My name is " + Q);
			// Relational Operators
			// Logical Operators

// Incremental operators

		// Rules for pre increment
		// 1.Increment the value
		// 2.Assign the value
		// 3.Update the incremented value

		// int a = 2, b, c;
		// a=++a;
		// System.out.println(a);
		// a = ++a + ++a; // 2+1=3 + 3+1=4 // 3+4=7
		// b = ++a; // 7+1=8
		// c = ++b;
		// ++c; // if we assign ++c then only c value will increment otherwise it will
		// show b
		// value
		// System.out.println(a); // its value is showing 8 because we are incrementing
		// the value a by giving ++a
		// System.out.println(b);
		// System.out.println(c);

		// Rules for post increment
		// 1.Assign the value
		// 2.Increment the value
		// 3.Update the incremented value

		
		  int a = 2, b, c;
		  b = a++ + a++; // b=2+ (2+1=3) = 5
		  c = b++;
		  c++; 
		  c=b++;
		  System.out.println(a); 
		  System.out.println(b);
		  System.out.println(c);
		 

		// Decremental operators

		
		// Pre Decremental operators
		/*
		 * int a = 6, b, c; b = --a + --a; // 6-1=5 + 5-1=4 , b=5+4=9 c = --b; // c
		 * value will be 9-1=8 System.out.println(a); // a=4 bcoz the last value of a is
		 * 4 as per above line System.out.println(b); System.out.println(c);
		 */

		
		// Post Decremental operators
		/*
		 * int a = 6, b, c; b = a-- + a--; // 6 + 6-1=5 , b=6+5=11 c = b--; // c value
		 * will be 11-1=10 System.out.println(a); // a=4 bcoz 6-1=5 // 5-1=4
		 * System.out.println(b); // b=11-1=10 System.out.println(c); // c=b=11
		 */
	}

}
