//It is used along with switch keyword
//It doesnt hold the value of boolean,float,double
// It contains a block of code which is executed only when the switch value matches with the case.
//it contains break label to terminate the flow of execution
public class CaseKey {
	public static void main (String [] args) {
	char character='s';
	switch (character) {
	case 'a':
		System.out.println("A");
		break;
	case'b':
		System.out.println("B");
		break;
	case'c':
		System.out.println("C");
		break;
	case'd':
		System.out.println("D");
		break;
	case'e':
		System.out.println("E");
		break;
	case'f':
		System.out.println("F");
		break;
	case's':
		System.out.println("S");
		break;
	default:
		System.out.println("Enter a valid charecter");
	}
	}

}
