package Homework;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class DiceStatistics {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		List<Integer> rolls = new ArrayList<Integer>();
		
		System.out.print("How many times to roll the die?");
		int numRolls = Integer.parseInt(in.nextLine());
		
		int dieCap = 20;
		
		for (int i = 0; i < numRolls; i++) {
			int roll = rnd.nextInt(dieCap + 1);
			rolls.add(roll);
		}
		
		List<Integer> diceRolled = rolls.stream().filter(x -> x > 0).collect(Collectors.toList());
		
		for (int i = 0; i < dieCap; i++) {
			int number = i + 1;
			if (diceRolled.contains(number)) {
				long stat = diceRolled.parallelStream().filter(x -> x == number).count();
				System.out.println(number + " was rolled " + stat + " number of times.");
			}
		}
	}
}