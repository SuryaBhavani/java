/*THis will run even if the exception occur and not handeled
 * 
 */
public class FinallyInTryCatch {
	public static void main(String []args) {
		int num1=10;
		int num2=20;
		int num;
		try {
			num=num1/0;	
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally {
		System.out.println("Where the occured exception is handelled or not finally block will get executed");
		System.out.println(num1+num2);
		System.out.println(" For each try block there can be zero or more catch blocks, but only one finally block.");
		System.out.println("The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort).");
		}
	}

}
