package Practice;

public class Banking {
	public static void main(String[] args) {
		int AccountNumber=101189;
		String AccountName="Harish";
		double Balance=10000;
		String IFSC="VVIP005";
		int amount=500;
		String Salary="enquary";
//		System.out.println(AccountName);
//		System.out.println(AccountNumber);
		if (AccountNumber==101189) {
		
		switch (Salary) {
		case "withdraw":
			if (Balance>=amount) {
				Balance-=amount;
				System.out.println("withraw :"+ amount);}
			else
				System.out.println("not surficent balance");
			break;
		case "deposit":
		    Balance+=amount;
			System.out.println("amount created "+amount);
			break;
		case "enquary":
			System.out.println("Account Holder name : "+AccountName);
			System.out.println("AccountNumber : "+ AccountNumber);
			System.out.println("IFSC Code : "+IFSC);
			
		
		}
			
		System.out.println("Available balance : "+Balance);

	}
		else
			System.out.println("enter valid bank details");
	}
}
