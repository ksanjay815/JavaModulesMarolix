package Java;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {

		// Find a no is prime or not

		System.out.println("Enter any no");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(" is a Prime No");
		} else {
			System.out.println(" is not a Prime No");
		}
		
		
		//Find a  prime no between 1 to 100 and count
		/*
		 * for(int a=1;a<=100;a++) { int count =0; for(int b=1;b<=a;b++) { // 1%2=0, if
		 * (a%b==0) { count++; }else if (a%2==0) { System.out.println(a); } } }
		 */
	}
}
