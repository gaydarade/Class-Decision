import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ALittleProblem {
	public static void main(String[] args) {

		String sentence = "Some weird sentence we just made up.";
		char[] characters = sentence.toCharArray();
		List<String> vowels = new ArrayList<String>(Arrays.asList(new String[] {"a", "e", "i", "o", "u"}));
		
		int spaceCount = 0;
		int vowelCount = 0;
		
		for(char c : characters) {
			if (c == ' ') spaceCount++;
			if (vowels.contains(Character.toString(c).toLowerCase())) { vowelCount++; }
		}
		System.out.println("Number of spaces in sentence is: " + spaceCount);
		System.out.println("Number of vowels in sentence is: " + vowelCount);
	}
}