package Module2;

public class NonstaticMethod {

	public static void main(String[] args) {
		
		System.out.println("main");
		NonstaticMethod mp = new NonstaticMethod();  
		mp.hall();				
		mp.readingroom();		
		mp.kitchen();			
	}

	public void hall() {
		int a = 10;
		String b = "hall";
		System.out.println(a);
		System.out.println(b);

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
