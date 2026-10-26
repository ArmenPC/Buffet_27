/*
 *	Author: Armen Sargsyan
 *  Date: 10/22/2026
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Please enter a width:");
		Scanner input = new Scanner(System.in);
		int width = input.nextInt();
		int height = input.nextInt();

		int count2 = 0;
		while(true){
			if(count2 == height){
				break;
			}
				int count = 0;
				while(true){
					if(count == width){
						break;
					}
					System.out.print("*");
					count++;
				}
				System.out.println();
			count2++;
		}
	}
}
