package Assignment4;
//When the value of i becomes 3 and j become 2, their execution but for other values of i and j, the loop will run
//smoothly.

public class TwoFor {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		for (i=0;i<10;i++) for (j=0;j<10;j++) {
			if (i!=3&&j!=2) 
		
				System.out.println("i = " + i+ " " +"j = "+ j);

		}}
}


