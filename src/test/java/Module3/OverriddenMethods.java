package Module3;

// method over riding

class apple {
	
	
	public void m1(int i) { // creating same methods with diff arguments
	System.out.println("1st method");	
	}
public void m1(String s) { // creating same methods with diff arguments
	System.out.println("2nd method");
	}
}
class banana extends apple {  // Inheritance 
	public void m1(int a) {
		System.out.println("3rd method"+" "+a);
	}
public void m1(String f) {
	System.out.println("4th method"+" "+f);	
	}
}


public class OverriddenMethods {
public static void main(String[] args) {
	apple app = new banana(); // creating upcasting object
	
	app.m1(10);   // overridden the method it will print subclass methods 
	app.m1("sanjay" ); // overridden the method it will print subclass methods

	
	// creating object to print methods
	apple a = new apple();
	a.m1(20);
	a.m1("kumar");
}
}
