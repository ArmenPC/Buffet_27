/*
 *	Author: Armen Sargsyan
 *  Date: 10/20/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner input = new Scanner(System.in);

	System.out.println("Welcome to the guessing game!");
	int secret = (int)(Math.random() * 1000) + 1;
	System.out.println("(secret: " + secret + ")");

	while (true) {
		System.out.print("Please guess a number: "); 
		int guess = input.nextInt();
		if (guess == secret) {
			System.out.println("You got the number!");
			break;
		} else if (guess < secret) {
			System.out.println("The number is higher.");
		} else {
			System.out.println("The number is lower.");
		}
	}
	}
}