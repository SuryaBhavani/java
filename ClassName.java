//method Overloading
public class ClassName {
	int num1;
	int num2;
	int num3;
	int getSum(int num3,int num4) {
		
		return num1+num2+num3+num4;
	}
	int getSum(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
	
	public static void main(String args[])   {
		ClassName obj1=new ClassName();
		
		obj1.num1=10;
		obj1.num2=20;
		obj1.num3=30;
		
		//ClassName obj3=(ClassName)obj1.clone();
		//System.out.println(obj1.wish());
		

		System.out.println(obj1.getSum(10,20));
		System.out.println(obj1.getSum(101,20,30));
		
		//obj1.as();
		
	}

}


