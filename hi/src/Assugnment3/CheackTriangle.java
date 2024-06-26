package Assugnment3;

public class CheackTriangle {

	public static void main(String[] args) {
		int a=80,b=80,c=60,d;
		d=a+b+c;
		if (d==180&&a==b&&b==c)
		System.out.println("all equal sides");
		else if ((d==180) && (a==b||b==c||c==a))
		System.out.println("two sides are equal");
		else if (d==180)
			System.out.println("three sides not equal");
		else
			System.out.println("enter valid values");
			

	}

}
