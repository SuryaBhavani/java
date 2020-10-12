/*to break out of loops or switch statements
 * Continue:to end the current iteration and continue with next iteration
 */
public class BreakAndContinue {
	public static void main(String [] args) {
		int num1=10;
		int num2=20;
		for(int i=1;i<num1;i++) {
			
			if (i==9) {
				break;
			}
			else if(i==6) {
				continue;
			}
			else {
				System.out.println("This is the "+i+" iteration");
			}
			
		}
		
	}

}
