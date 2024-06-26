package Assugnment3;

public class MarrageInsurence {

	public static void main(String[] args) {
		
         int age=113;
         String Gender="female"; 
         String Mar="no";
          if (age>100)
        	 System.out.println("nuvu inka poledha enti ? ");
         else if (age>25&&Gender=="female"&&Mar=="no")
        	 System.out.println("nuvu qualified");
         else if (Mar=="yes")
        	 System.out.println("nuvu qualified");
         else if (age>30&&Mar=="no"&& Gender=="male")
        	 System.out.println("nuvu qualified");
         else
        	 System.out.println("insures kavali ante pelli chesuko");
        	 
        	 
        	 
         
	}

}
