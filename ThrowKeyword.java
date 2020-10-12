/*Throw is used to throw customized exceptions explicitely
 * 
 */
public class ThrowKeyword {
	public static void main(String [] args) {
	
	int age=17;
	if(age<18) 
		throw new ArithmeticException("Younger than the eligible age");
	else
		System.out.println("Eligible for voting");	
	}
}


