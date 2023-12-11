package Module3.InterfaceClass;

public class Tata implements IndianCars, USACars {

	public void twomirror() {
		System.out.println("Tata two mirror");
	}

	
	public void rightsteering() {
		System.out.println("Tata rightsteering");

	}


	@Override
	public void leatherseat() {
		System.out.println("Tata leatherseat");
		
	}


	@Override
	public void autosensor() {
		System.out.println("Tata autosensor");
		
	}

}
