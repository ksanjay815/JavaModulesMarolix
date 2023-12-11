package Java;

public class ConditionalStatemnet {

	public static void main(String[] args) {
		
		// 1. write a prog to find 22 is even or odd no
		
		int a=22;
		if(a%2==0) {
			System.out.println("It is an Even no");
		}else if(a%2!=0) {
			System.out.println("IT is an Odd no");
		}
		else {
			System.out.println("Invalid no");
		}

		// 2. Print the greatest no between 270 & 456
		
		int b=270, c=456;
		
		if (b>c) {
			System.out.println("The greatest no is "+b);
		}else if(c>b) {
			System.out.println("The greatest no is "+c);
		}else {
			System.out.println("both are equal");
			
		}
		
	}

}
