package Module3;

// Up Casting
class Student // Ex-1
{
	public void view() {
		System.out.println("Student details are :");
		System.out.println("Name:John P");
		System.out.println("MJCET");
		System.out.println("BTECH-Computer Science");
		System.out.println("Degree-58.3%\nINT-75%\nSSC-66%");
	}
}

class Admin extends Student {
	public void edit() {
		System.out.println("Edit details of Student");
		System.out.println("Name:John P");
		System.out.println("MJCET");
		System.out.println("BTECH-Computer Science");
		System.out.println("Degree-60.9%\nINT-75%\nSSC-66%");
	}
}

public class Upcasting {
	public static void main(String[] args) {

		// upcasted object

		/*
		 * Student s1 = new Admin(); s1.view();
		 */

		// here Student(left side)--->Compilation
		// Admin(right side)--->Execution
		// s1.edit();

		// downcasted object

		Student s1 = new Admin();
		Admin s2 = (Admin) s1;

	
		s2.view();
		 s2.edit();

	}
}
