package Assignment4;

public class Trianglesides {

	public static void main(String[] args) {
//		Given three values representing the lengths of the three sides of a triangle, determine whether the triangle is
//		regular (all three sides are equal), symmetric (two sides are equal), or irregular (no two sides are equal)
int a=15,b=15,c=15;
if (a==b&&b==c&&c==a)
	System.out.println("3 sides are equal");
else if (a==b||b==c||c==a)
	System.out.println("2 side");
else
	System.out.println("not equal");
	}

}
