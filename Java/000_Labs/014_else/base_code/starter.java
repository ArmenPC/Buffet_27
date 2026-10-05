/*
 *	Author: Armen Sargsyan
 *  Date: 9/30/2026
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int secret = (int)(Math.random() * 1000) + 1;
		System.out.println("(secret: " + secret + ")");

		Scanner sc = new Scanner(System.in);
		System.out.println("(secret: " + secret + ")");
		int guess = sc.nextInt();

		if (guess == secret) {
			System.out.println("Correct!");
		} else {
			System.out.println("Incorrect"); 
		}

	}
}
