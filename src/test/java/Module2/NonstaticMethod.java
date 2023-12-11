package Module2;

public class NonstaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		NonstaticMethod mp = new NonstaticMethod();  // creating object
		mp.hall();				// calling methods using object
		mp.readingroom();		
		mp.kitchen();			
	}

	public void hall() {
		int a = 10;
		System.out.println(a);
		System.out.println("hall");

	}

	public void readingroom() {
		int a = 20;
		System.out.println(a);
		System.out.println("readingroom");
	}

	public void kitchen() {
		System.out.println("kitchen");
	}

}
