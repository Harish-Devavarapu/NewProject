package Practice;

public class Primskip {

	public static void main(String[] args) {
		int n=50,c=1;
		while(n>0) {
			
		for(int i=1;i<=99999999;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if (i%j==0)
					count++;
				
			
			
		}
if(count==2 && n>=c) {
	System.out.print(i+" ");
	c++;
}
	}
		n--;
	
	}
}}
