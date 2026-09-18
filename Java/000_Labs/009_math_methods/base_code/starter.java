/*
 * Author: 
 * Date: 
 */
import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        // the string "I love to learn coding remotely." will appear in
        // the command window when you compile and run this program.
        System.out.print("I love to learn coding remotely.");
        
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int number = sc.nextInt();
        double number2 = sc.nextDouble();
        sc.nextDouble();

        System.out.println("Text: " + text);
        System.out.println("Number 1: " + number);
        System.out.println("Number 2: " + number2);
        
        System.out.println(Math.max(1,2));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(2,4));
        System.out.println(Math.max(7,8));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.pow(5,13));
        
        // Fixed Lines: Added the missing closing parenthesis
        System.out.println(Math.max(13 - 6 * 11, 30 % 7 * (-2)));
        System.out.println(Math.sqrt(3 * 8 + 31 % 7));
        System.out.println(Math.pow(37 / 3, 35 % 21));
        
        // Fixed Line: Separated the two math functions into their own print statements
        System.out.println(Math.pow(2, 14 % 3));
        System.out.println(Math.sqrt(2 * 6));
    }
}