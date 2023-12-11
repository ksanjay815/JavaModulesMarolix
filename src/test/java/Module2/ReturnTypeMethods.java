package Module2;

public class ReturnTypeMethods {

	public static String m1() { // remove void for return type
		return "sanjay kumar";
	}

	// with argument
	public static int m2(int m) { // static method
		return m;
	}

	// without argument
	public int m3() { // non static method
		return 50;
	}

	public static void main(String[] args) {
		System.out.println(m1());
		System.out.println(m2(25));

// for non static method create object and print
		ReturnTypeMethods Rtm = new ReturnTypeMethods();
		System.out.println(Rtm.m3());

	}
}
