package Module2;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		// String redColorCode = "\u001B[31m"; to print output color in red

		// System.out.println("Enter your name "+ redColorCode); //to print output color
		// in red

		System.err.println("Enter your name "); // to print Scanner input color in red
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("my name is " + s);

		float f = sc.nextFloat();
		System.out.println(f);

	}
}
