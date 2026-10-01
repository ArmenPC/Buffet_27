/*
 *	Author: Armen Sargsyan
 *  Date: 9/24/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely.");

		System.out.println("1"); 
		int num1 = input.nextInt();
		System.out.println("You entered " + num1);

		System.out.println("2");
		int num2 = input.nextInt();
		System.out.println("You entered " + num2);
		
		boolean g = num1 == num2;
        if(g==true){
            System.out.println(num1 + " is equal to num2!");
        }

		boolean k = num1 != num2;
        if(k==true){
            System.out.println(num1 + " is not equal num2!");
		}

	}
}
