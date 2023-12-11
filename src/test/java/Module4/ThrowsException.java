package Module4;

// using throws keyword

class rrr {
	public void m1() throws Throwable {
		m2();
		System.out.println("sanjay kumar");
	}

	public void m2() throws Throwable {
		int a = 7 / 0;
		System.out.println(a);
	}
}

public class ThrowsException {
	public static void main(String[] args) throws Throwable {
		rrr r = new rrr();
		r.m1();

// it will throw exception but it will not catch it so we used mostly try & catch
	}
}
