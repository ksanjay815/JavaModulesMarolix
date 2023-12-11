package Module2;

public class MethodOverloading {

	public static void m1(int a, long h) {
		System.out.println(a + " " + h);
	}

	public static void m1(String s, String b) {
		System.out.println(s + " " + b);
	}

	public static void m1(long k) {
		System.out.println(k);
	}

	public static void m1() {
		System.out.println("Welcome to Java");
	}

	public static void main(String[] args) {
		m1();
		m1(10, 45678);
		m1("san", "jay");
		m1(45667L);
		
		
		
		/*
		 * //another method calling by using objects if not static MethodOverloading MP
		 * = new MethodOverloading(); MP.m1(45465);
		 */
		 
	}
}