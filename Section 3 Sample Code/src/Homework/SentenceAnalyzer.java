package Homework;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class SentenceAnalyzer {

	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a string for sentence analysis: ");
		String input = in.nextLine();
		String ptn = "^[A-Z]{1}[\\s\\S]+(\\.|\\?)$";
		boolean match = (input.matches(ptn)) ? true : false;
		if (match == true) {
			System.out.println("Your sentence length is " + input.length() + " character(s) long.");
			
			String[] words = input.toLowerCase().replaceAll("[,\\.\\?\\!\\-]", "").split(" ");
			
			System.out.println("Your sentence length is " + words.length + " word(s) long.");
			
			List<String> wordList = new ArrayList<String>();
			List<String> wordCompare = new ArrayList<String>();
			List<Character> charList = new ArrayList<Character>();
			List<Character> charCompare = new ArrayList<Character>();
			for (String w : words) {
				wordList.add(w);
				if (!wordCompare.contains(w)) { wordCompare.add(w); }
				for (char c : w.toCharArray()) {
					charList.add(c);
					if (!charCompare.contains(c)) { charCompare.add(c); }
				}
			}
			
			Collections.sort(wordCompare);
			for (String w : wordCompare) {
				long wrdCount = wordList.parallelStream().filter(x -> x.equals(w)).count();
				System.out.println("The word " + w + " appeared " + wrdCount + " time(s).");
			}
			Collections.sort(charCompare);	
			for (Character c : charCompare) {
				long chrCount = charList.parallelStream().filter(x -> x == c).count();
				System.out.println("The character " + c + " appeared " + chrCount + " time(s).");
			}
		}
		else
		{
			System.out.print("No");
		}
		in.close();
	}
}