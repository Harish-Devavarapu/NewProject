package Loops;

public class StrPallendrum {

	public static void main(String[] args) {
		
		String h="121";
		int i=0;
		int j=h.length()-1;
		while(i<j) {
			if (h.charAt(i)==h.charAt(j)) {
				System.out.println("pallen");
				
			}
			else {
				System.out.println("not");
				break;
			}
			i++;
			j--;
		}
			
		

	}

}
