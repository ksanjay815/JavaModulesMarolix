package Module3.Abstractclass;

public class Total {
	public static void main(String[] args) {

		
		 /* Tata t = new Tata(); 
		  t.twomirror();
		  t.rightsteering(); 
		  Mahindra m = new
		  Mahindra(); 
		  m.twomirror();
		  m.rightsteering();
		 */
		// we cannot create object of abstract class like above, thats why using
		// upcasting

		
		/*
		 * IndianCars ic = new Tata(); // upcasting to create objects of abstract class
		 * ic.twomirror(); ic.rightsteering(); }
		 */
		 

	  IndianCars ic = new Tata(); // downcasting to create objects of abstract class
	  Tata t =(Tata) ic;
	  
	  t.rightsteering();
	  t.twomirror();
	 t.autosensor();
	 t.autowindows();
	
	}
	}
