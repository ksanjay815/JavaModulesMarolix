package Constructor;

public class Constructors {
	
	String name;
	int age;
public static void main(String[] args) {
	
	Constructors c0 = new Constructors();
	
	c0.name="sanjay";
	c0.age=28;
	Constructors c1 = new Constructors();
	c1.name="kumar";
	c1.age=27;
	Constructors c2 = new Constructors();
	c2.name="prasad";
	c2.age=26;
	
	System.out.println(c0.name+" "+c0.age);
	System.out.println(c1.name+" "+c1.age);
	System.out.println(c2.name+" "+c2.age);
	
}
}
