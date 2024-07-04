package Assignment5;

public class Forth {
	static int i = 1; 
	public static void main(String[] args) 
	    { 
	       static int i = 1; 
	        for (Forth.i = 1; Forth.i < 10; Forth.i++) { 
	            i = i + 2; 
	            System.out.print(i + " "); 
	        } 
	    } 
}
//error because we cant use static in main method.