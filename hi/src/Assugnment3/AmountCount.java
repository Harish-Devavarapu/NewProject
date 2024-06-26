package Assugnment3;

public class AmountCount {

	public static void main(String[] args) {
		int amount=888*2,n;
		if (amount>=500) {
			n=amount/500;
			System.out.println("500 notes ;"+n);
			amount=amount%500;
		}
       if (amount>=200) {
			n=amount/200;
			System.out.println("200 notes ;"+n);
			amount=amount%200;
       }
       if (amount>=100) {
			n=amount/100;
			System.out.println("100 notes ;"+n);
			amount=amount%100;
       }
       if (amount>=50) {
			n=amount/50;
			System.out.println("50 notes ;"+n);
			amount=amount%50;
      } 
       if (amount>=20) {
			n=amount/20;
			System.out.println("20 notes ;"+n);
			amount=amount%20;
      }
       if (amount>=10) {
			n=amount/10;
			System.out.println("10 notes"+n);
			amount=amount%10;
      }
       if (amount>=5) {
			n=amount/5;
			System.out.println("5 notes"+n);
			amount=amount%5;
      }
       if (amount>=2) {
			n=amount/2;
			System.out.println(n);
			amount=amount%2;
      }
       if (amount>=1) {
			n=amount/1;
			System.out.println(n);
			amount=amount%1;
      }
	}

}
