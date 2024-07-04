package Assignment4;

public class SevenMulti {

	public static void main(String[] args) {
// Write a java program to print multiples of 7 numbers except 56 ,49.
// int a=0;
//		 while(a<=10) {
//			 if (a!=8&&a!=7)
//				 System.out.println(a*7);
//			     a++;
//			 }
//		 }
//	}

int i=0; 
 while(i<=70) {
	if (i%7==0)
		if(i!=56&&i!=49)
			System.out.println(i);
	      i++;
}
}}
