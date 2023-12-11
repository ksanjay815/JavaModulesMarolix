package Module3;

class A // Ex‐1: call to super explicit
{
	public A(int i) {
		System.out.println("A class default constructor");
		System.out.println(i);
	}
}

class B extends A {
	public B() {
		super(100);// Explictly we added
		System.out.println("B class Default Constructor");

	}
}

public class SuperClass1 {

	public static void main(String args[]) {
		B b1 = new B();

	}
}
