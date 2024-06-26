package Assugnment3;

public class MaxOfThree {

	public static void main(String[] args) {
		int a=311,b=21,c=141;
//		if ((a>b&a>c)?a:((b>c)?b:c))
		if (a>b&a>c)
			System.out.println("highest number is "+ a);
		else if (b>c)
			System.out.println("Highest value is "+b);
		else
			System.out.println("Highest value is "+c);

	}

}
