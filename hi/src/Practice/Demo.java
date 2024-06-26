package Practice;

public class Demo {

	public static void main(String[] args) {
	int n=299, temp=0,sum=0, r=0;
	while(n>0) {
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
	}
	System.out.println(sum);

	}

}
