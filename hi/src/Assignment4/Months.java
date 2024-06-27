package Assignment4;

public class Months {

	public static void main(String[] args) {
//		. Write a program in to read any Month Number in integer and display Month name in
//		the word. (use case statement ).
int month=12;
if (month<=12) {
switch (month) {
case 1:{
	System.out.println("January");
	break;
}
case 2: {
	System.out.println("febuary");
	break;
}
case 3:{
	System.out.println("march");
	break;
}
case 4:{
	System.out.println("April");
}
case 5:{
	System.out.println("may");
	break;
}
case 6: {
	System.out.println("june");
	break;
}
case 7:{
	System.out.println("july");
	break;
}
case 8:{
	System.out.println("August");
	break;
}
case 9:{
	System.out.println("september");
	break;
}
case 10: {
	System.out.println("oct");
	break;
}
case 11:{
	System.out.println("November");
	break;
}
case 12:{
	System.out.println("december");
	break;
}
}
	}
else
	System.out.println("enter valid Month Number from 1-12 only");
	}
}
