package Module3;

// method over riding

class apple {
		
	public void m1(int i) { // creating same methods with diff arguments
	System.out.println("1st method "+i);	
	}

}
class banana extends apple {  // Inheritance 
	public void m1(int a) {
		System.out.println("2nd method"+" "+a);
	}
}
public class OverriddenMethods {
public static void main(String[] args) {
	banana b = new banana(); 
	
	b.m1(10); 
   	
	
	
}
}
