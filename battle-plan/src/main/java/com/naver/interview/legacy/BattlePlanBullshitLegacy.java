package com.naver.interview.legacy;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Muddy Orge
 *
 */
public class BattlePlanBullshitLegacy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Select your character : KNIGHT, WARRIOR, WIZARD, THIEF");
		String character = in.nextLine();
		
		Random random = new Random();
		int initialLevel = random.nextInt(10);
		System.out.println("You choose " + character);
		System.out.println("Your initial level " + initialLevel);
		

		System.out.println("The dragon has come to the front...");
		Integer staminaOfDragon = 100;
		
		switch (character) {
			case "KNIGHT":
				System.out.println("Wear a helmet and an armor");
				System.out.println("Ride a horse");
				System.out.println("Draw a sword and carry a lance");
				break;

			case "WARRIOR":
				System.out.println("Wear short pants");
				System.out.println("Draw a warhammer");
				break;

			case "WIZARD":
				System.out.println("Wear silk dresses and hat");
				System.out.println("Play music");
				break;

			case "THIEF":
				//do nothing
				break;

			default:
				break;
		}

		System.out.println("Start battle!");
		while(staminaOfDragon > 0) {
			switch (character) {
				case "KNIGHT":
					System.out.println("Charge with a lance, cut!");
					staminaOfDragon = staminaOfDragon - (initialLevel * 7 + 10);
					break;

				case "WARRIOR":
					System.out.println("Roar to ememy, smash!");
					staminaOfDragon = staminaOfDragon - initialLevel * 10;
					break;

				case "WIZARD":
					System.out.println("Spell curse~~");
					staminaOfDragon = staminaOfDragon - (initialLevel * 4 + 30);
					break;

				case "THIEF":
					System.out.println("Hit, run and hide");
					staminaOfDragon = staminaOfDragon - initialLevel * 1;
					break;

				default:
					break;
			}
		}
		
		System.out.println("Dragon is dead");
		
	}

}
