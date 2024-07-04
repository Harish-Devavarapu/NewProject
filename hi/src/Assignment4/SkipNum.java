package Assignment4;

public class SkipNum {

	public static void main(String[] args) {
//When the value of i becomes 4 or 18, skips its execution but for other values of i, the loop will run smoothly.

		int a=0;
		while(a<30) {
			if (a!=4&&a!=18)
				System.out.println(a);
			a++;
		}

	}

}
