
public class animal {
	String name;
	int age;
	String colour;
	int teeth;
	animal(){
		this.name="jerry";
		this.age=10;
		this.colour="cream";
		this.teeth=50;
	}
				
	String getName() {
		
		
		return name;
	}
	int getAge() {
		return age;
	}
	String getColour() {
		return colour;
	}
	String getColour(String colour) {
		return colour;
	}
	int getTeeth() {
		return teeth;
	}
	public static void main(String args[]) {
		animal cat=new animal();
		animal rat=new animal();
		cat.name="tom";
		cat.age=10;
		cat.colour="black";
		cat.teeth=40;
		System.out.println(cat.getName()+" is a cat of age "+cat.getAge()+" which is "+cat.getColour("white")+" has "+cat.getTeeth()+" teeth");
		System.out.println(rat.getName()+" is a rat of age "+rat.getAge()+" which is "+rat.getColour("white")+" has "+rat.getTeeth()+" teeth");
		
	}

}
