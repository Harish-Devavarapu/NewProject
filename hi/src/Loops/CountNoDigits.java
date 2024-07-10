package Loops;
//Write a Java program that reads a positive integer n=88888 and counts the number of digits.

public class CountNoDigits {

	public static void main(String[] args) {
		int n=888888,count=0;
//		while (n>0) {
//			n=n/10;
//			count++;
//			
//		}
		for (int i=n;i>0;i+=0) {
			i=i/10;
			count++;
		}
System.out.println(count);
	}

}
