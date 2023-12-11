package Module3;

class A1 {
	public A1(int i) {
		System.out.println("A class default constructor");
	}
}

class B1 extends A {
	public B1(int i) {
		super(100);
		System.out.println("B class default constructor");
	}
}

class C extends B {
	public C() {
		super();
		System.out.println("C class constructor");
	}
}

public class SuperClass3 {
	public static void main(String[] args) {
		C c = new C();
	}
}
