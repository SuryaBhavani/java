
public class dogWithConst {
	String name,colour;
	int age;
	dogWithConst(){
		name="Doggy";
		colour="Cream";
		age=90;
	}
	String getName() {
		return name;
	}
	String getColour() {
		return colour;
	}
	int getAge() {
		return age;
	}
	public static void main(String []args) {
		dogWithConst obj1=new dogWithConst();
		System.out.println("The name of the dog is "+obj1.getName()+" with the colour "+obj1.getColour()+" is having an age of "+obj1.getAge());
	}

}
