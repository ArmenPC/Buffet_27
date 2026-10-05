/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Input number here"); 
		int x = sc.nextInt();

		if (x > 20) {
			System.out.println("Greater than 20");
		} else if (x >= 12) {
			System.out.println("Greater than or equal to 12");
		} else if (x == 8) {
			System.out.println("Equal to 8");
		} else if (x <= 4) {
			System.out.println("Less than or equal to 4");
		} else {
			System.out.println("40");
		}
	}
}