/*It store single characeters 
 *  must be surrounded by single quotes
 * primitive data type
 * range:0 to 65,535
 * default value '\u0000' and size 2 bytes because it uses unicode system but not ascii code system
 */
public class CharKeyword {
	public static void main(String [] args) {
		char char1='A';
		char char2='a';
		char char3=65; //if we provide integers it will give corresponding ascii values
		char char4=97;
		int char5=(int)char1; //type casting char to corresponding ascii value
		char char6='\u0061';//the unicode value 
		char char7=(char)(char1+9);
		System.out.println("char 1 ="+char1);
		System.out.println(("char2 ="+char2));
		System.out.println(("char 3="+char3));
		System.out.println(("char 4="+char4));
		System.out.println(("char5's corresponding ascii value="+char5));
		System.out.println(("char 6="+char6));
		System.out.println(("char 7="+char7));
		
	}

}
