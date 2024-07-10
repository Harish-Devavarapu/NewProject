package Loops;

public class Armstrong {

	public static void main(String[] args) {
		int n=153,val=0;
		int d=n;
		while(d>0) {
			int temp=d%10;
			 val+=temp*temp*temp;
			d=d/10;
			
		}
System.out.println(val);
if (n==val)
	System.out.println("armstrong");
else
	System.out.println("not pal");
	}

}
