package Constructor;

// overloading constructor

public class Watermelon {
	String name;
	Float percentage;

	public Watermelon() { // creating constructor
		System.out.println("1st watermelon");
	}

	public Watermelon(String name) { // creating overloading constructor
		this.name = name; // use this. if name is similar
	}

	public Watermelon(float f) { // creating overloading constructor
		percentage = f;
	}

	public static void main(String[] args) {
		Watermelon w1 = new Watermelon();
		Watermelon w2 = new Watermelon("sanjay");
		System.out.println(w2.name);

		Watermelon w3 = new Watermelon(56.45f);
		System.out.println(w3.percentage);
	}
}
