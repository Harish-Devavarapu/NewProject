package Assugnment3;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2010;
		if (year%4==0&&year%100!=0||year%400==0)
			System.out.println("leap year");
		else
			System.out.println("not leap year");
			

	}

}
