import java.util.Scanner;

public class RegularExpressions {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Create a username
		// No spaces, first letter of firstname, entire lastname
		// less than 20 characters.
		// create email address {username}@exampl.org

		System.out.print("Enter in First Name: ");
		String fn = in.nextLine();
		System.out.print("Enter in Last Name: ");
		String ln = in.nextLine();
		
		String username = ((fn.trim().substring(0,1)) + ln.trim()).toLowerCase();
		username.replaceAll(" ", "");
		
		String pattern = "^[a-z]{1,20}$";
		
		if (!username.matches(pattern)) {
			System.out.println(username.length());
			username = username.substring(0, 19);
			System.out.println(username.length());
		}
		
		System.out.print(username);
		
		
		// String .matches({regex}) - returns boolean
		
		// Match a hexidecimal color code
		// ^#([0-9a-fA-F]}{3}|[0-9a-fA-F]{6})$
		/*
		String pattern = "^#([0-9a-fA-F]}{3}|[0-9a-fA-F]{6})$";
		String code = "#ffaadf";
		
		if (code.matches(pattern)) {
			System.out.println("Valid hexidecimal color code");
		}
		*/
		in.close();
	}
}
