package Assignment4;

public class EvenSkip {

	public static void main(String[] args) {
//. Print Even Numbers from 20 to 40 Except 28, and 32
 int a=20;
 while (a<=50) {
	 if (a%2==0) {
		 if (a!=28&&a!=32)
	 System.out.println(a);
	 }
	 a++;
 }

	}
}
