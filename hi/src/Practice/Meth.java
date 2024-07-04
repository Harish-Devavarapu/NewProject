package Practice;

public class Meth {
	static Meth o=null;
	int a=11;
	static int b=12;
    int c=13;
    
    public static void cri() {
    System.out.println(b);
    System.out.println(Meth.o.a);
    }

	public static void main(String[] args) {
		int hai=10;
		o= new Meth();
		cri();
		System.out.println(hai);
		System.out.println(o.a);
		System.out.println(b);
		System.out.println(o.c);

	}

}
