package Assignment4;

public class NumbersInMonth {

	public static void main(String[] args) {
// Write a Java program to calculate the total number of days in a given month
 int month=13;
 if (month<=12) {
	 switch (month) {
	 case 1:
		 System.out.println("jan 31 days");
		 break;
		 
	case 2:
		 System.out.println("Feb 28 days");
		 break;
	case 3:
		System.out.println("Mar 31 days");
		break;
	case 4:
		System.out.println("apr 30 days");
		break;
	case 5:
		System.out.println("May 31 days");
		break;
	case 6:
		System.out.println("june 30 days");
		break;
	case 7:
		System.out.println("july 31 days");
		break;
	case 8:
		System.out.println("Aug 31 days");
		break;
	case 9:
		System.out.println("sep 30 days");
		break;
	case 10:
		System.out.println("oct 30 days");
		break;
	case 11:
		System.out.println("nov 30 days");
		break;
	case 12:
		System.out.println("dec 31 days");
		break;
	default:
		System.out.println("enter values upto 12");
	 }
 }
	 else
		 System.out.println("enter values upto 12");
		 
		
		 
	 }

	}

