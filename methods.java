	
		
		

class results{
	int tel,hin,eng,math;
	int avg=tel+hin+eng+math;
	int percent() {
		if (avg<=100 || avg>=75){
			System.out.println("pass,A grade");
			return tel+hin+eng+math;
			
		}
		else if (avg<=74 || avg>=35 ) {
			System.out.println("pass,B grade");
			return tel+hin+eng+math;
			
			
		}
		else {
			System.out.println("fail");
			return avg;
			
		}
	}
}
public class methods {
	public static void main(String args[]) {
		results obj1=new results();
		obj1.tel=40;
		obj1.eng=40;
		obj1.hin=2;
		obj1.math=10;
		System.out.println(obj1.percent());
	}
}
	



	
	
	
	
	
	

