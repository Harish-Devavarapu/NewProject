package Practice;

public class Methods {
	int a =16;
	static int b=18;
	static Methods obj=null;
	public static void harish() {
		System.out.println(b);
		System.out.println(obj.a);
		
	}
	public void insta() {
		System.out.println(a);
	}
    public static void main(String[] args) {
		int c =38;
		obj = new Methods();
	   harish();
       obj.insta();
       System.out.println(c);
       //Byte obj=new Byte();
       Byte.getData();
	}
}
class Byte{
	
	static void getData()
	{
		//Methods m =new Methods();
		System.out.println(Methods.obj.a);
	}
	
}