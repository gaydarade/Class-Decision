import java.util.Scanner;

public class Program {
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * To create an instance of a class use the "new" keyword with one of the constructors
		 * The example below uses the default constructor which will prompt for a person's
		 * information:
		 */
		Person p1 = new Person();
		
		System.out.println(String.format("%s %s", p1.getFirstName(), p1.getLastName()));
		
		/*
		 * You can also create a new person using the overloaded constructor of person
		 * that will assign the arguments passed to the fields/properties of the Person class
		 */
		Person p2 = new Person("Fred", "Flintstone");
		
		System.out.println(String.format("%s %s", p2.getFirstName(), p2.getLastName()));
		
		in.close();
	}
}