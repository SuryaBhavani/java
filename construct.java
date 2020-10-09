class box{
	int len,bre,hei;
	box(){  //Using Default Constructor
		len=10;
		bre=10;
		hei=10;
	}
	box(int len,int bre,int hei){    //Using Parameterized Constructor
		this.len=len;
		this.bre=bre;
		this.hei=hei;
	}
	int setDimensions() {
		return len*bre*hei;	
	}
}
public class construct {
	public static void main(String [] args) {
		box j1=new box();
		box j2=new box();
		box j3=new box(10,20,30);
		j1.len=10;
		j1.bre=20;
		j1.hei=50;
		System.out.println(j1.setDimensions());
		System.out.println(j2.setDimensions());
		System.out.println(j3.setDimensions());
		
	}

}
