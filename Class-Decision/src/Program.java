
public class Programs {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		int z = 18;
		
		char letter = 'A'; // character is actually an int
		// ASCII -- ISO-8995 || only applies to English Characters
		// UTF-8 -- Unicode || { Supports multiple languages}
		char m = '\u0065';
		
		if (letter == 65) {
			System.out.println("This is an uppercase \u22D1");
		}
		
		String dog = "Bulldog";
		String dog2 = "Beagle";
		String dog3 = "beagle";
		/*
		 if (condition) {body} else if (condition) {body} else { }
		 String.equals() for String equality check
		 || or, && and,  ! not
		
		If  x >= 1 set z = x + y else set z = 0
		 int var = (x >= 1) ? {true} : {false}
		z = x >= 1 ?  x + y : 0;
		
		if (x >= 1){
			z = x + y;
		}
		else {
			z = 0;
		}
		
		if ((y == 5) && (x == 3 || x == 5)){
			
		}
		
 		if (dog2.equals(dog3)) {
			System.out.println("Same dog");
		}
		if (x == 5) { }
		
		if (x > y) {
			System.out.println("X is greater than Y");
			System.out.println("Something else");
		}
		else if (y < x) {
			
		}
		else {
			
		}
		
		 switch { case statement } char / int
		 switch (x) { case : , default: }
		*/
		switch (y / x){
			case 5:
				System.out.println("x is 5");
				break;
			case 4:
			case 3:
			case 2:
				System.out.println("x is 2, 3, or 4");
				break;
			case 1:
				System.out.println("x is 1");
				break;
			default:
				System.out.println("no clue what x is");			
		}
	}
	/*
	 function / methods
	 function / method / header signature 
	
	 access modifiers { private, public, protected, final, static }
	 private = only accessible in its own scope 
	 public = accessible anywhere
	 protected = publicly accessible but only in its own package
	*/
	// Compiler signature view (overloading)
	// public static void checking(String)
	public static void checking(String n) { }
	// public static void checking(String, String)
	public static void checking(String n, String l) { }
	// public static void checking(String, int)
	public static void checking(String n, int x) { }
	public static void checking(int x , String n) { 
		if (x == 3) { return; }
	}
	public static String fullName(String fn,  String ln) {
		if (ln.startsWith("D")) { return ""; }
		
		return String.format("%s %s", fn, ln);
	}	
}