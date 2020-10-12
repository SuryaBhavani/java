class DefaultKeyword{
	void display() {
		System.out.println("This is written in parent class");
		}
	public static void main(String []args) {
		parents obj=new parents();
		obj.display();
}
}
class parents  extends DefaultKeyword {
	void display() {
		System.out.println("By using default we can override the parent class method with child class method\nwe made it just now");
	}
		
}
	
		
			
		
	
	


