package Module3;

//Encapsulation , using getter & setter methods
public class Encapsuation {
	private String name;
	private int age;

	public String getName() {
		return name;
	
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println(age);
	}

	public static void main(String[] args) {
		Encapsuation e = new Encapsuation();
		e.setAge(20);  // always call setter method bcoz it contains arguments
		e.setName("sanjay");
		
		
		
	}
}
