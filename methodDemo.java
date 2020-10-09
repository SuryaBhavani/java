/*General form:
 * type name(parameters-list){ "type means type of data returned by method"
 * body of method
 * }
 */
class students{
	
	double grades(double math,double science,double hindi,double english) {
		return math*science*hindi*english;
	
		
	}
}
class teacher{
	students obj1=new students();
	
	String  app() {
		if (obj1.grades(20,30,40,50)>50){
			return("good");
		}
		else {
			return("bad");			
			
		}
		
	}
}
class methodDemo{
	public static void main(String args[]) {
		
	 teacher obj=new teacher();
		System.out.print("you are doing "+obj.app());
		
	
	}
}