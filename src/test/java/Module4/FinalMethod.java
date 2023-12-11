package Module4;

public class FinalMethod {

	// finalize method used for garbage collector

	public void finalize() {
		System.out.println("sanjay");
	}

	public static void main(String[] args) {
		FinalMethod F = new FinalMethod();
		F = null; // if you removed this nothing will print
		System.gc(); // garbage collector

		// or F.finalize();
	}
}
