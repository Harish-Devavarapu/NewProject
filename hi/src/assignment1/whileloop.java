package assignment1;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter value");
		int a=s.nextInt();
        while (a<10) {
	System.out.println(a);
	a+=3;
}
	}

}
