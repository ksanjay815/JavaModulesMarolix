package Module4;

public class TryCatchFinallyException {
	public static void main(String[] args) {
		System.out.println("Sanjay kumar");
		/*
		 * try { int a = 5 / 0; System.out.println(a); // Arithmetic Exception } catch
		 * (ArithmeticException ae) { //Arithmetic Exception parent is RuntimeException
		 * so we can write this also
		 * 
		 * }
		 */
		try {
			int a = 5 / 0;
			System.out.println(a); // Arithmetic Exception
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e);
		}
finally { // is used to write important code
	System.out.println("hi how are u");
}
	}
}
