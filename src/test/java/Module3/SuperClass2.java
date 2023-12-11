package Module3;

class ICIC {
	String accname;

	public ICIC(String accname) {
		this.accname = accname;
		System.out.println(accname);
	}
}

class Bank extends ICIC {
	public Bank() {
		super("John");
	}
}

public class SuperClass2 {
	public static void main(String args[]) {
		Bank b1 = new Bank();
	}
}
