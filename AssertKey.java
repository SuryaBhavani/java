/* It is mainly used as a debugging tool and is disabled
 * used to check whether our logical conditions are true or not
 * they should not be used to change replace error messages
 */
public class AssertKey {
	
	public static void main(String args[]) {
		int num=23;
		assert num >= 20:"the number should be less than 20";
		System.out.println("the given number is "+num);
		
	}

}
