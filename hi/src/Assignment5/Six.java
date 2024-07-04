package Assignment5;

public class Six {

//	int x = 10; 
//	public
//	    static void main(String[] args) 
//	    { 
//	        System.out.println(x); 
//	    } 
//	    static
//	    { 
//	        System.out.print(x + " "); 
//	        }
//}
//	 int x = 10; 
//	 public
//	     static void main(String[] args) 
//	     { 
//	         Six t1 = new Six(); 
//	         System.out.println(t1.x); 
//	     } 
//	     static
//	     { 
//	         int x = 20; 
//	         System.out.print(x + " "); 
//	     } 
//	 }
//	int x = 10; 
//	public
//	    static void main(String[] args) 
//	    { 
//	        System.out.println(Six.x); 
//	    } 
//	    static
//	    { 
//	        int x = 20; 
//	        System.out.print(x + " "); 
//	    } 
//	}
	static int x = 10; 
	public
	    static void main(String[] args) 
	    { 
	        Six t1 = new Six(); 
	        Six t2 = new Six(); 
	  
	        t1.x = 20; 
	        System.out.println(t1.x + " "); 
	        System.out.println(t2.x); 
	    } 
	} 