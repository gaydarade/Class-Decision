/*
  Scanner attaches to the keyboard using System.in
  The following import statement is required to use the scanner
*/
import java.util.Scanner;

public class ConsoleIO {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter in First Name: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Enter in age: ");
		int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println(firstName + "\n" + age);
		
		// Close the scanner before ending the entire application to prevent IO handle attachment issues.
		scanner.close(); 
	}

}
