/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.println("Welcome to the ASCII Museum!");
	System.out.println("Please choose an exhibit");
	System.out.println("1. Banana");
	System.out.println("2. Drinks");
	System.out.println("3. Apples");

	Scanner sc = new Scanner(System.in);
	String exhibit = sc.nextLine();

	if(exhibit.equals("Banana") || exhibit.equals("Banana")){
			System.out.println(".-.");
			System.out.println("/  |");
			System.out.println("|  /");
			System.out.println(".'\\|.-; _");
			System.out.println("/.-.;\\  |\\|");
			System.out.println("'   |'._/ `");
			System.out.println("|  \\");
			System.out.println("\\  |");
			System.out.println("jgs     '-'");

	}
	else if(exhibit.equals("Drinks")){
			System.out.println("  ____________");
			System.out.println(" <____________>");
			System.out.println(" |            |");
			System.out.println(" |            |");
			System.out.println(" |            |");
			System.out.println(" \\          /");
			System.out.println("  \\________/");
			System.out.println("      ||");
			System.out.println("      ||");
			System.out.println("      ||");
			System.out.println("      ||");
			System.out.println("      ||");
			System.out.println("   ___||___");
			System.out.println("  /   ||   \\");
			System.out.println("  \\________/");
	}
	else if(exhibit.equals("Apples")){
			System.out.println("  ,--./,-.");
			System.out.println(" / #      \\");
			System.out.println("|          |");
			System.out.println(" \\        /    hjw");
			System.out.println("  `._,._,'");
	}
	else{
	
	}
}
}