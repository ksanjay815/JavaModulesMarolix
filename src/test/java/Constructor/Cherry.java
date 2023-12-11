package Constructor;

public class Cherry {
	// Parametrised Constructor
	String name;
	long mnum;
	
	public Cherry(String n, long num) {  // constructor with parameters
		name=n;
		mnum=num;
	}
	
public static void main(String[] args) {
	Cherry c = new Cherry("Sanjay", 812123);
	//c.name="san"; c.mnum=24768;
	System.out.println(c.name+" - "+c.mnum);
	Cherry c1 = new Cherry("kumar", 465477);
	System.out.println(c1.name+" - "+c1.mnum);
	Cherry c2 = new Cherry("Prasad", 457565);
	System.out.println(c2.name+" - "+c2.mnum);
	

}
}
