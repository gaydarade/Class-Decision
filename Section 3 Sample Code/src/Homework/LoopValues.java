package Homework;
import java.util.Scanner;

/*
 * Create a program that receives integers from the user and keeps a running total of the integers.
 * When the user enters in 0 stop the loop and then display the total. 
 */

public class LoopValues {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		int i = 0;
		int a = 0;
		do
		{
			System.out.print("Please enter a number: ");
			i = Integer.parseInt(in.nextLine());
			a += i;
		} while (i != 0);
		
		System.out.println("The total of your numbers is: " + a);
	}
}