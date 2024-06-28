package Assignment4;

public class Leapyear {
	static int year=2024;

public static void main(String[] args) {
		if (year%4==0&&year%100!=0||year%400==0)
			System.out.println("leap year");
		else
			System.out.println("not leap year");

	}

}
