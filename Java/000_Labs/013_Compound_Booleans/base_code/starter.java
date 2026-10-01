/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Please type in 3 numbers:"); 

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int largest = 0;
		int smallest = 0;

		if ((a >= b) && (a >= c))  {
			largest = a;
		}
		if ((b >= c) && (b >= a))  {
			largest = b;
		}
		if ((c >= b) && (c >= a))  {
			largest = c;
		}


		System.out.println("largest is " + largest);


		if ((c <= b) && (c <= a))  {
			smallest = c;
		}
		if ((b <= a) && (b <= c))  {
			smallest = b;
		}
		if ((a <= c) && (c <= b))  {
			smallest = a;
		}

		System.out.println("smallest is " + smallest);

	}
}
