import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class People {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		People p = new People("Tom", "White", 23);
		People d = new People("Tim", "Walsh", 24);
		List<People> peeps = new ArrayList<People>();
		peeps.add(p);
		peeps.add(d);

		/*
		 * public as sort (person x, person y) {
		 * x.getFirstName().compareTo(y.getFirstName());
		 }*/
		for (People pep : peeps) {
			System.out.println(pep.getFirstName());
		}
		
		// Lambda expression () ->, () =>
		// Ascending
		// Descending
		Collections.sort(peeps, (x,y) -> y.getFirstName().compareTo(x.getFirstName()));
		peeps.parallelStream().filter(l -> l.getFirstName().startsWith("T")).collect(Collectors.toList()).forEach(l -> System.out.println(l.getFirstName()));
		
		// Stream | ParallelStream
		// Collections / a stream represents functions to manage a collection
		// Stream - single threaded apartment model
		// ParallelStream - parallel processing model.
		// Parallel v Thread
		// -----------------------------
		// Race condition
		// Deadlock- One thread does not release resources, locks other threads out
		
		
		
		peeps.parallelStream()
		.filter(x -> x.getFirstName().startsWith("T") && x.getLastName().startsWith("W"))
		.sorted((x , y) -> y.getFirstName().compareTo(x.getFirstName()))
		.sorted((x , y) -> Integer.compare(x.getAge(), y.getAge()))
		.forEach(x -> System.out.println(x.getFirstName() + " " + x.getLastName()));
		
		//-------------------
		
		// POJO (Plain Old Java Object)
		// 1.) all fields/ properties must be private with a public getter/setter
		// 2.) only use a default constructor

	}
	
	private String firstName;
	public String getFirstName() { return firstName; }
	public void setFirstName(String fn) { firstName = fn; }
	
	private String lastName;
	public String getLastName() { return lastName; }
	public void setLastName(String ln) { lastName = ln; }
	
	private int age;
	public int getAge() { return age; }
	public void setAge(int a) { age = a; }
	
	public People(String fn, String ln, int a) {
		setFirstName(fn);
		setLastName(ln);
		setAge(a);
	}


	public People() {
	}
}
