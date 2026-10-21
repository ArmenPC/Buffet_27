/*
 *	Author: Armen Sargsyan
 *  Date: 10/20/2026
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
			// Your code goes below here
		int money = 100;
		System.out.println("Slot Machine Rules:"); 
			System.out.println("1. Each player starts with $100.");
			System.out.println("2. Input a wager less than your total amount of money.");
			System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
			System.out.println("   a. If two numbers match, you double your money.");
			System.out.println("   b. If three numbers match you triple your money.");
			System.out.println("   c. If none match, you lose your money.");
			while (true) {
				System.out.println("-------------------------------------------------;");
				System.out.println("Would you like to play the slots? (Yes/yes/Y/y): ");
				String answer = input.nextLine();
			}

			if (answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")) {
				// the game goes here
			} else if (answer.equals("No") || answer.equals("no") ||
			answer.equals("N") || answer.equals("n")) {
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
				break;
			} else {
				System.out.println("That wasn't quite the correct answer. Try again.");
			}

			System.out.print("You have $" + money + ". How much would you like to wager? ");
			int wager = input.nextInt();
			input.nextLine();

			while (wager <= 0 || wager > money) {
				if (wager <= 0) {
					System.out.print("Sneaky! No negatives for 0! Please enter a new wager: ");
				} else {
					System.out.print("You only have $" + money + "! Please enter a smaller number: ");
				}
				
				wager = input.nextInt();
					input.nextLine();
			}

			if (roll1 == roll2 && roll2 = roll3) {
				money = money + wager * 2;
				System.out.println("JACKPOT! Your wager has been tripled!");
			} else if(roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
				money = money + wager;
				System.out.println("You won! Your wager has been doubled!");
			} else {
				money = money - wager;
				System.out.println("Didn't win this time, better luck next time!");
			}
			System.out.println("You now have $" + money + ".");

			if (money == 0) {
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				break;	
			}
	}
}
