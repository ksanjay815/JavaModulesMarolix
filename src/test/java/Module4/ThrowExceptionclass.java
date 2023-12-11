package Module4;

public class ThrowExceptionclass {
public static void main(String[] args) {
	
	try {
		throw new Exception("sanjayException");
	} catch(Exception e) {
System.out.println(e.getMessage());		
	}
}
}
