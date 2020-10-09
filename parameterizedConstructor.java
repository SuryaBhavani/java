class student{
	String name;
	int age;
	double marks;
	student(String s,int a,double m){
		this.name=s;
		age=a;
		marks=m;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	double getMarks() {
		return marks;
	}
	
	
	}

public class parameterizedConstructor {
	public static void main(String[]args) {
		student s1=new student("surya",12,50.00);
		student s2=new student("Bhavani",5,45);
		student s3=new student("Subha",6,47);
		student s4=new student("",31,90);
		student s5=s4;
		s4.name=null;
		s5.name="bhavani";
		
		
	  
		System.out.println(s1.getName()+s1.getAge()+s1.getMarks());
		System.out.println(s2.getName()+s2.getAge()+s2.getMarks());
		System.out.println(s3.getName()+s3.getAge()+s3.getMarks());
		System.out.println(s4.getName()+s4.getAge()+s4.getMarks());
		System.out.println(s5.getName()+s5.getAge()+s5.getMarks());
		

	}
}
