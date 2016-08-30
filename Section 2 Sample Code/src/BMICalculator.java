/*  It is computed by taking the individual's weight (mass) in kilograms and dividing it by the 
	square of their height in meters.
	
	Use the 4 categories below to to determine the output.
	
	BMI				Category
	-----------------------------------
	< 18.5			Under Weight
	18.5 - 24.9		Normal
	25.0 - 29.9		Overweight
	30.0 or more	Obese
	-----------------------------------
 */
import java.text.Format;
import java.util.Scanner;

public class BMICalculator {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		//TODO Prompt for person's height in meters
		//TODO Prompt for person's weight in kilograms
		//TODO Calculate the person's BMI
		//TODO Determine which category the person belongs to
		//TODO Print out BMI and Category
		
		System.out.print("Height (meters): ");
		double h = Double.parseDouble(in.nextLine());
		System.out.print("Weight (kilos): ");
		double w = Double.parseDouble(in.nextLine());
		
		double bmi =  w / (h*h);
		System.out.println("Your specific BMI is " + bmi + ".");
		String m = "";
		if (bmi <= 18.5 && bmi >= 0) { m = "under weight"; }
		else if (bmi >= 18.5 && bmi <= 24.9) { m = "normal"; }
		else if (bmi >= 25.0 && bmi <= 29.9) { m = "overweight"; }
		else if (bmi < 0) { m = "n/a"; }
		else { m = "obese"; }
		// ASK DAMON ABOUT DECIMAL FORMATS
		System.out.print("Your BMI qualifies you as " + m + ".");
	}
}

