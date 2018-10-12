package diceRoll;

import java.util.Scanner;
import java.util.Random;

public class diceRoller {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userSides;
		String userContinue;
		int d1;
		int d2;
		
		System.out.println("Welcome to the Grand Circus Casino!\n");
		
		System.out.println("Would you like to roll the dice?");
		userContinue = scnr.next();
		
		while (userContinue.equals("yes")) {
			System.out.println("How many sides are on these dice?");
			userSides = scnr.nextInt();
			d1 = generateRandomDieRoll(userSides);
			d2 = generateRandomDieRoll(userSides);
			System.out.println("The first die rolled " + d1 + " and the second rolled " + d2 + "!");
			System.out.println("Do you want to roll again?");
			userContinue = scnr.next();
		}
		
		
	}
	
	private static int generateRandomDieRoll(int sides)  {
		Random rand = new Random();
		int die;
		
		die = rand.nextInt(sides) + 1;
		return die;
	}
}
