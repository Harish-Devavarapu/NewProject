package Assignment4;

public class Grade {
int english=100;
int telugu=90;
int hindi=8;

	public static void main(String[] args) {
		Grade ob=new Grade();
		int sum=ob.english+ob.telugu+ob.hindi;
		System.out.println("Total marks :"+sum);
		int percent=sum/3;
		System.out.println("percentage :"+percent);
		if (percent>85&&percent<=100)
			System.out.println("you scored A grade");
		else if (percent>70&&percent<=85)
			System.out.println("you scored B grade");
		else if (percent>55&&percent<=70)
			System.out.println("you scored c grade");
		else if (percent>55&&percent<=40)
			System.out.println("you scored d grade");
		else 
			System.out.println("Nuvu chadivi bokka...");



		

	}

}
