package Arrays;

public class Missing {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,7},Lenght=0;
		
		for (Lenght=1;Lenght<=10;Lenght++) {
			boolean Present=check( arr, Lenght);
			if(Present==false) {
				System.out.print(Lenght+" ");
			continue;}
	
		}

	}
   static boolean check(int arr[],int Lenght) {
	  for (int i=0;i<arr.length;i++) {
		  if (arr[i]==Lenght) {
			 return true;
		  }
			  
	  }
	  return false;
  }
}
