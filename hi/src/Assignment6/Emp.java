package Assignment6;
//Write a Java class called Employee that extends Person and adds a private field for
//salary. Create a constructor that takes in a name, age, and salary as parameters and
//initializes the fields using the super keyword to call the Person constructor. Also,
//create a method called displaySalary that prints out the employee's salary.

public class Emp {
	String name;
	int age;
	private int sal;
	static Emp obj=null;
	Emp(String name,int age,int sal){
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	public static void dispsal() {
		obj=new Emp(" ",0,50000);
      System.out.println(obj.sal);
	}

	public static void main(String[] args) {
		obj=new Emp("Harish",21,0);
		System.out.println(obj.name);
		System.out.println(obj.age);
		dispsal();

	}

}
