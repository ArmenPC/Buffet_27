/*
 *	Author: Armen Sargsyan
 *  Date: 10/15/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner input = new Scanner(System.in);

	System.out.print("Please enter your name: ");
	String name = input.nextLine();
	
	System.out.print("Please enter how many times you'd like to print your name: ");
	int times = input.nextInt();
	int count = 0;

	while (true) {
		if (count == times) {
			break;
		}
		System.out.println(name);
		count = count + 1;
	}

	



		
	}
}
