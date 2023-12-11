package Module4;

public class StaticArray {
	public static void main(String[] args) {
		// Step 1 to store array
		int a[] = { 10, 20, 30, 40, 50 };

		/*
		 * //Step 2 to store array int a[] = new int[4]; a[0] = 10; a[1] = 20; a[2] =
		 * 30; a[3] = 40;
		 */

		System.out.println(a[3]);
		System.out.println(a[0]);
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
	}
}
