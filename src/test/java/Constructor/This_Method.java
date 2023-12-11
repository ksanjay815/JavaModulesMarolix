package Constructor;
// construction chaining 
public class This_Method {   // this method
	
public This_Method() {
this("chennai", "Tamilnadu");
System.out.println("I am the first one");
}
public This_Method(String city, String state) {
	this(456765, 345456788L);
System.out.println(city + " "+ state);
}
public This_Method(int pincode, long helplineno) {
	System.out.println(pincode + " "+ helplineno);
}

public static void main(String[] args) {
	This_Method m = new This_Method();
	
}
}
