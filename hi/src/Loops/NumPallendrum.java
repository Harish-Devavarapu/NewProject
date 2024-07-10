package Loops;

public class NumPallendrum {

	public static void main(String[] args) {
		 int n=123321;
		 int d=n;
		 int rev=0;
		 while(d>0) {
		 int remin=d%10;
		 rev=rev*10+remin;
		 d=d/10;
		 }
System.out.println(rev);
if (n==rev)
	System.out.println("palen");
else
	System.out.println("not");
	}

}
