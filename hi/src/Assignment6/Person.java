package Assignment6;
//Write a Java class called Person with private fields for name and age. Create a
//constructor that takes in a name and age as parameters and initializes the fields.
//Also, create a method called introduce that prints out a message introducing the
//person with their name and age

public class Person {
	private String name;
	private int age;
	 static Person oj=null;
	Person(String name,int age)
	{
	this.name=name;
	this.age=age;
	}
	
    public static void introduce() {
    	 oj=new Person("Harish",21);
    	
    	System.out.println("Namaste "+ oj.name + " age " + oj.age +" old");
    	
    }
	public static void main(String[] args) {
//	    oj=new Person("Harish",21);
		introduce();
		

	}

}
