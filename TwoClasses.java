class FirstClass{
	String name;
	long salary;
	FirstClass(String name,long salary){
		this.name=name;
		this.salary=salary;

	}
	
}
public class TwoClasses {
	public static void main(String [] args) {
		FirstClass obj=new FirstClass("Swetha",1000000);
		System.out.println(obj.name+" earns a salary of "+obj.salary);
		
		
	}

}
