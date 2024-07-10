package Loops;
//Write a Java program that displays the sum of n odd natural numbers

public class SumOddNum {

	public static void main(String[] args) {
		int n=3,sum=0,count=0;
		for(int i=1;i<=2*n-1;i+=2) {
			sum+=i;
			
		}
		System.out.println(sum);
		

	}

}
