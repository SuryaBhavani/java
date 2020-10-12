
public class InnerClass {
	String msg="We are learning about prive modifier and inner class declaration here ";
	private class inner{
		void display() {
			System.out.println(msg);
		}
	}
	public static void main (String [] args) {
		InnerClass obj=new InnerClass();
		InnerClass.inner obj1=obj.new inner();
		obj1.display();
	}
}
