import java.util.Scanner;

public class Program {
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Create a username
		// No spaces, first letter of firstname, entire lastname, all lowercase, 
		// less than  or equal to 20 characters.
		// create email address {username}@example.org
		
		System.out.print("Enter in First Name: ");
		String fn = in.nextLine();
		System.out.print("Enter in Last Name: ");
		String ln = in.nextLine();
		ln = ln.replaceAll(" ", "");
		
		String fnLetter = Character.toString(fn.toCharArray()[0]);
		String fnLett = fn.substring(0, 1);
		
		String username = (fnLett + ln).toLowerCase().trim();
		String email = username + "@example.org";
		
		if(username.length() <= 20) {
			System.out.print(username + " is valid.");
		}
		
		in.close();
	}
}