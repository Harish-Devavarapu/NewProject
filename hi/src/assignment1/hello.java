package assignment1;
import java.util.Scanner;
public class hello
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
	
		
		 byte girl = s.nextByte();
		
		 int boy=s.nextInt();
		if ((girl>=21) && (boy>=24))
		{System.out.println("you can marry");
	
		}else {
			System.out.println("yoiu have to wait");
			}

	}

}
