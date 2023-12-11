package Module3.InterfaceClass;

public class Total {
	public static void main(String[] args) {

		/*
		 * Tata t = new Tata(); t.twomirror(); t.rightsteering(); Mahindra m = new
		 * Mahindra(); m.twomirror(); m.rightsteering();
		 */
		// we cannot create object of abstract class like above, thats why using
		// upcasting

		
		  IndianCars ic = new Tata(); // upcasting to create objects of abstract class
		  ic.twomirror();
		  ic.rightsteering(); }
		 
		/*
		 * IndianCars ic1 = new Mahindra(); // upcasting to create objects of abstract
		 * class ic1.twomirror(); ic1.rightsteering();
		 */

	}

