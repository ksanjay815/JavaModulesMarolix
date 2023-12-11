package Java;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		int a=7;
		
		switch(a) {
		case 1:	System.out.println("monday");
			break;
		case 2:	System.out.println("Tuesday");
			break;
		case 3:	System.out.println("Wednesday");
			break;
		case 4:	System.out.println("Thursday");
			break;
		case 5:	System.out.println("Friday");
			break;
		case 6:	System.out.println("Saturday");
			break;
		case 7:	System.out.println("Sunday");
			break;
		default:System.out.println("Invalid day is selected");
			break;
			}
		
char c ='T';
		
		switch(c) {
		case 'm':	System.out.println("monday");
			break;
		case 't':	System.out.println("Tuesday");
			break;
		case 'w':	System.out.println("Wednesday");
			break;
		case 'T':	System.out.println("Thursday");
			break;
		case 'f':	System.out.println("Friday");
			break;
		case 's':	System.out.println("Saturday");
			break;
		case 'S':	System.out.println("Sunday");
			break;
		default:System.out.println("Invalid day is selected");
			break;
		}
	}
	

}
