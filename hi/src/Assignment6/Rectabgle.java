package Assignment6;
//Write a Java class called Rectangle with private fields for length and width. Create
//a constructor that takes in a length and width as parameters and initializes the fields.
//Also, create a method called calculateArea that returns the area of the rectangle
//(length * width)

public class Rectabgle {
private int lenght;
private int width;
 Rectabgle obj=null;
 Rectabgle(int lenght,int widht){
	 this.lenght=lenght;
	 this.width=width;
 }
 
public static void calculateArea() {
	obj=new Rectabgle(3,6);
	System.out.println("area = " + lenght*width);
}
	public static void main(String[] args) {
		obj=new Rectabgle(3,6);
		calculateArea();

	}

}
