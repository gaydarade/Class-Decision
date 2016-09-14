import java.io.InputStream;
import java.util.Scanner;

public class People {
	public static Scanner in = Scanner(System.in);
	public static void main(String[] args) {
		
		
		Person p = new Person();
		

		/*
		 * public asd sort (perxon x, person y) {
		 * x.getFirstName().compareTo(y.getFirstName());
		 }*/
		
		// Lambda expression () ->, () =>
		// Ascending
		// Descending
		Collections.sort(people, (x,y) -> y.getFirstName().compareTo(x.getFirstName()));
		
		// Stream | ParallelStream
		// Collections / a stream represents functions to manage a collection
		// Stream - single threaded apartment model
		// ParallelStream - parallel processing model.
		// Parallel vs Thread
		// -----------------------------
		// Race condition
		// Deadlockv- One thread does not release resources, locks other threads out
		
		
		
		people.stream()
		.filter(x - > x.getFirstName().startsWith("W") && x.getLastName().startsWith("S")))
		.sorted((x , y) -> y.getFirstName().compareTo(x.getFirstName)))
		.sorted((x , y) -> Integer.compare(x.getAge(), y.getAge()))
		.forEach( x-> System.out.println(x.getFirstName + " " + x.getLastName()));
		people.parallelStream();
		
		//-------------------
		
		// POJO (Plain Old Java Object)
		// 1.) all fields/ properties must be private with a public getter/setter
		// 2.) only use a default constructor

		in.close();
	}
	
	
	private static Scanner Scanner(InputStream in2) {
		// TODO Auto-generated method stub
		return null;
	}
	private String firstName;
	public String getFirstName() { return firstName; }
	public void setFirstName(String fn) { firstName = fn; }
	
	private String lastName;
	public String getLastName() { return lastName; }
	public void setLastName(String ln) { lastName = ln; }
	

}
