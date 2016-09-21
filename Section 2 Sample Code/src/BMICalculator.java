
import java.util.Scanner;
import java.text.DecimalFormat;

public class BMICalculator {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Height (meters): ");
		double h = Double.parseDouble(in.nextLine());
		System.out.print("Weight (kilos): ");
		double w = Double.parseDouble(in.nextLine());

		double b = w / (Math.pow(h, 2));
		DecimalFormat fmt = new DecimalFormat("#.0");
		String bmi = fmt.format(b);
		System.out.println("Your specific BMI is " + bmi + ".");
		String m = "";
		if (b <= 18.5 && b >= 0) {
			m = "under weight";
		} else if (b >= 18.5 && b <= 24.9) {
			m = "normal";
		} else if (b >= 25.0 && b <= 29.9) {
			m = "overweight";
		} else if (b >= 30) {
			m = "obese";
		} else {
			m = "n/a";
		}
		System.out.print("This classifies you as " + m + ".");
	}
}
