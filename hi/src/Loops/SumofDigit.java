package Loops;

public class SumofDigit {

	public static void main(String[] args) {
		int n=232,sum=0;
		while(n>0) {
			int temp=n%10;
			 sum=sum+temp;
			 n=n/10;
			
		}
      System.out.println(sum);
	}

}
