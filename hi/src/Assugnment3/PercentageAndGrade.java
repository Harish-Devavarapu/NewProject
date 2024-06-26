package Assugnment3;

public class PercentageAndGrade {

	public static void main(String[] args) {
		int percent=18;
		char grade;
		if (percent<=100&&percent>90)
			System.out.println("you got "+percent+"% with A grade");
		else if (percent<=90&&percent>70)
			System.out.println("you got "+percent+"% with B grade");
		else if (percent<=70&&percent>50)
			System.out.println("you got "+percent+"% with C grade");
		else if (percent<=50&&percent>35)
			System.out.println("you got "+percent+"% with D grade");
		else if(percent<=34&&percent>0)
			System.out.println("you got "+percent+"%....eripuka nuvu fail ayav");
		else
			System.out.println("correct percentage enter cheyi");
		

	}

}
