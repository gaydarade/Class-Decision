package Homework;

import java.util.Scanner;

/*
 * Using regular expressions and string.matches() create a program to validate
 * html color codes.
 * 
 * Valid Color Codes:
 * #fffaaa
 * #ffa
 * #9900bb
 */

public class HtmlColorValidator {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		String ptn = "^[0-9a-fA-F]{3}|[0-9a-fA-F]$";
		System.out.print("Please enter a hexadecimal color: ");
		String hex = in.nextLine();
		
		if (hex.matches(ptn)) {
			System.out.print(hex + " is valid.");
		}
		else {
			System.out.print(hex + " is not valid.");
		}

	}
}