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
		/*
		 * \d - digit
		 * \D - non-digit
		 * \w - word character a-zA-Z
		 * \W - non-word character
		 * \s - space character
		 * \S - non-space character
		 * 
		 * ^ - starts with
		 * $ - ends with
		 * 
		 * Quantifiers
		 * . - o or more - anything else ^d.$
		 * + - 1 or more
		 * {x} - must match x number of times
		 * {x, y} - must match x to y number of times
		 * {x,} - must match  minimum of x number of times
		 * 
		 * Sets
		 * [a-f0-9] - set match
		 * [^g-k] - not contains, can't be in this set
		 * () - grouping
		 * | - or statement
		 */
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
