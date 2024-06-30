package Assignment4;

public class Voting {

	public static void main(String[] args) {
//Write a Java Program to determine if a person is eligible to 
// vote based on their age and nationality
		int age=17;
		String Nation="Brave";
		String Gender="female";
		if (age>=18&&Nation=="Brave"&&Gender=="male")
			System.out.println("you can vote");
		else if(age>=21&&Nation=="Brave"&&Gender=="female")
			System.out.println("you can vote");
		else
			System.out.println("you can't vote");

	}

}
