//1.Creation of class
//2.Creation of Objects
//3.How we can assign one obj ref to other and their changes
public class classDemo {
	int var1; //variable declaration
	double var2;
	String var3;
	public static void main(String[] args) {

		classDemo obj=new classDemo();//creating a new object
		//obj is the instance of classDemo
		//here obj will contains a copy of var1,var2,var3
		//to access these variables we use(.)
		classDemo obj2=new classDemo();//"new" allocates memory for an object during run time
		classDemo obj3=obj2;//obj3 is also assigned to obj2,so they both point same obj
		//When you assign one object reference variable to another object reference
		//variable, you are not creating a copy of the object, you are only making a copy of the
		//reference.
		obj3.var3="suryaa";
		obj.var1=1;//compiler assigns 20 to the var1 copy of obj object
		obj.var2=34.555;
		obj.var3="";
		obj2.var1=20;//compiler assigns 20 to the var1 copy of obj object
		obj2.var2=34.555;
		obj2.var3="surya";
		obj2=null;//though we dellocated obj2 by assigning null,the obj3 will still points the demo object
		System.out.println(obj.var1);
		//System.out.println(obj2.var1);
		System.out.println(obj3.var3);//though we changed var3 in obj3,it is not changed in obj3 because it depends on obj2
		
		
		

	}

}
