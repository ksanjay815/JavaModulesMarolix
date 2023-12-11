package Module3;

// Inheritance single level & multi level

class megastar { // super class or parent class or base class

	public void m1() {
		System.out.println("M1 method");
	}

	public void m2() {
		System.out.println("M2 method");
	}
}

class Ramcharan extends megastar { // sub-class or child class
	public void m3() {
		System.out.println("M3 method");
	}

	public void m4() {
		System.out.println("M4 method");
	}
}

//multilevel inheritance 

class Varun extends Ramcharan { // sub-class or child class
	public void m5() {
		System.out.println("M5 method");
	}

	public void m6() {
		System.out.println("M6 method");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		// multi level inheritance
		
		// we can create objects of individual class or the subclasses
		Varun r = new Varun();

		// always create subclass objects to access both sub class and superclass
		// methods

		// calling methods
		r.m1();
		r.m2();
		r.m3();
		r.m4();
		r.m5();
		r.m6();
	}
}
