package Java;

public class Factorial {

	public static void main(String[] args) {
		
	/*	int n, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			System.out.println(fact);
		}*/
		
		
		
		// pattern
int n= 5;
for (int i=1;i<=n;i++) {
	for(int j=i;j<=n;j++) {
		System.out.print("* ");
	}
	System.out.println();
	}


// multiplication table
int n1=5;
for(int i=1;i<=10;i++) {
	System.out.println(n1+"*"+i+"="+n1*i);
	//System.out.printf("%d*%d=%d",n1,i,n1*i);
}



}
	}
