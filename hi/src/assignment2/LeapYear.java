package assignment2;

public class LeapYear {

	public static void main(String[] args) {
		int year=2100;
	String result = (year % 4 == 0 & year % 100 != 0) | (year % 400 == 0) ? "leap year" : "not leap year";
      System.out.println(year + " " + result);
		
		
	    }
}