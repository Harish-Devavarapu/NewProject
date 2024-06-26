package assignment2;

public class GreatestOfThree {
	public static void main(String[] args) {
		int a=0x11,b=0x13,c=0x14,d=0x172,e=0x123;
		int GreatestValue=(a>b&&a<c&&a>d&&a>e)?a:((b>c&&b>d&&b>e)?b:(c>d&&c>e)?c:d>e?d:e);
//		int a=5,b=10,c=15,GreatestValue;
//		GreatestValue = (a>b&a>c)?a:((b>c)?b:c);
		System.out.println("GreatestValue "+GreatestValue);
	}
}