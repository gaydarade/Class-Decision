import java.util.Scanner;
import java.util.List; // Working with Collections
import java.util.ArrayList; // Working with Collections

public class ArraySample {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array
		// A collect5ion of like data types
		// 1.) must initialize / set number of elements. ( once set can't change number of elements )
		
		System.out.print("What is your name: ");
		String name = in.nextLine();
		
		String str1 = "str 1";
		String str2 = "str 2";
		String str3 = "str 3";
		
		int[] nums = new int[5];
		int[] nums2 = new int[] { 5, 4, 1, 99, 33, 44, 17 };
		
		//String{s}
		
		String[] strSet = new String[3];
		String[] strSet3 = new String[] {str1, str2, str3, "Damon"};
		
		// List<T>
		// 1.) And and Remove objects ( Resize backing Array)
		
		// List <of type> names = new ArrayList <of type>();
		List<String> names = new ArrayList<String>();
		names.add("Damon"); // adds an item at the end of the array
		names.add("Dog");
		names.add("Cat");
		names.add("Damon");
		names.remove("Damon"); // removes an item with the value "Damon" ( first occurrence )
		
		names.size(); // Tells the number of elements in the list
		names.get(2); // gets index 2 from the backing array "Cat"
		names.clear(); // Clear out all values / size
		names.toArray(); // returns backing array
		
		if(names.contains("value")) {
			// do something
		}  // returns a boolean value
		
		for (String s : names) {
			System.out.println(s);
			
			
		}
		
		
		// Do Until / While
		// 1.) Post Test loop
		// 2.) Generic all purpose loop
		str1 = "dog";
		do {
			System.out.print("Enter a name: ");
			name = in.nextLine();
		}
		while (name.length() < 3);
		
		// While loop
		// 1.) Pre Test Loop
		// 2.) Generic all purpose loop
		while(name.length() < 3) {
			System.out.print("Enter a name: ");
			name = in.nextLine();
		}
		
		// For Loop
		// 1.) Used for incremental stepping
		// 2.) ({loop variable;{condition};{stepping value}})
		// 3.) Running a set number of times, accumulation, dealing with an array by index
		char[] letters = name.toCharArray();
		for (int x = 0; x < letters.length; x++) {
			System.out.println(letters[x]);
		}
		
		// Foreach loop
		// 1.) Arrays and Collections by 'Value'
		//foreach(char c in letters)
		for(char c : letters) {
			System.out.print(c);
		}
	
	}
}
