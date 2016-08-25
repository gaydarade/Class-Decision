
public class Person {
	/*
	 * Java conventions use private ( backing variables for fields/properties )
	 * 
	 * Getters ( Java Community calls these accessors )
	 * ----------------------------------------------------------
	 * 1.) Provides public access to retrieve values from a class field/property
	 * 2.) The function header uses the same data type and it returns the backing variable
	 * 3.) Java convention adds a "get" prefix to backing variable to create the getter
	 *     function's name
	 *     
	 * Setters ( Java Community calls these mutators )
	 * ----------------------------------------------------------
	 * 1.) Provides public access to set set the value of a class field/property
	 * 2.) The function header takes an argument that is the same data type as the backing variable
	 * 3.) Java convention adds a "set" prefix to the backing variable's name to create the 
	 *     setter function's name
	 */
	
	private String firstName;
	public String getFirstName() { return firstName; }
	public void setFirstName(String fn) { firstName = fn; }
	
	private String lastName;
	public String getLastName() { return lastName; }
	public void setLastName(String ln) { lastName = ln; }
	
	/*
	 * Constructor
	 * ----------------------------------------------------------
	 * A constructor is used to create an instance of a class
	 * 1.) If not included, Java automatically adds a blank default constructor
	 * 2.) A class can have more than one constructor with proper overloading
	 * 3.) A constructor should "best practice" contain all the functionality to populate a class
	 */
	
	/**
	 * Default constructor that prompts for the Person's First / Last Name
	 */
	public Person() {
		System.out.print("Enter First Name: ");
		firstName = Program.in.nextLine();
		
		System.out.print("Enter Last Name: ");
		lastName = Program.in.nextLine();	
	}
	
	/**
	 * Overloaded constructor for a person that allows the First / Last name to be passed
	 * and assigned without prompting
	 * @param fn Represents the Person's First Name
	 * @param ln Represents the Person's Last Name
	 */
	public Person(String fn, String ln) {
		
	}
}