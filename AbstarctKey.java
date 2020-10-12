/*Abstract Key word is used to create abstract class which does have body and can't create an instance 
 * but it will act as a base to sub class
 * if we use abstract for a method ,then it too will not have the body
 */
abstract class Parent{
	String name="Swathi";
	String mail="swathi@401";
	int age=20;
	abstract void study();  //abstract method
}
class Child extends Parent{
	int graduationYear=2022;
	void study() {
		System.out.println("  Works really very hard.");
	}
	
}

public class AbstarctKey {
	public static void main(String []args) {
		Child obj=new Child();
		System.out.print(obj.name);
		System.out.print(" with the age "+obj.age);
		System.out.print(" and mail id "+obj.mail);
		System.out.print(" will graduate in the year "+obj.graduationYear);
		obj.study();
		
	}

}
