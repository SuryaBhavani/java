
public class dog {
	String name;
	String colour;
	int age;
	String getName() {
		return name;
	}
	String getColour() {
		return colour;	
	}
	int getAge() {
		return age;
	}
	public static void main(String args[]) {
		dog obj1=new dog();
		obj1.name="puppy";
		obj1.colour="white";
		obj1.age=15;
		System.out.println("The name of the dog is "+obj1.getName()+" with the colour "+obj1.getColour()+" is having an age of "+obj1.getAge());
	}

}
