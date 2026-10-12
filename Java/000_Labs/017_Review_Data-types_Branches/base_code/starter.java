/*
 *  Author: Armen Sargsyan
 *  Date: 10/9/2026
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("What is your title? Ex: Slayer of Dragons");
        String title = input.nextLine();

        System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
        String role = input.nextLine();

        if (role.equals("Warrior") || role.equals("warrior")) {
                System.out.println("You've chosen the Warrior! For honor!");
        } else if (role.equals("Wizard") || role.equals("wizard")) {
                System.out.println("You've chosen the Wizard! Excelsior!");
        } else if (role.equals("Rogue") || role.equals("rogue")) {
                System.out.println("You've chosen the Rogue! How cunning!");
        } else {
            System.out.println("You've decided not to choose a role. Rerun program.");
        }

        System.out.println();
        int points = 20;
        System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely");

        System.out.print("Strength (1-10): ");
        int strength = input.nextInt();
        if (strength > 10 || strength > points) {
            System.out.print("Please input a smaller value. Strength (1-10): ");
            strength = input.nextInt();
        }
        points = points - strength;
        System.out.println("You have " + points + " left to spend.");

        System.out.print("Dexterity (1-10): ");
        int dexterity = input.nextInt();
        if (dexterity > 10 || dexterity > points) {
            System.out.print("Please input a smaller value. Dexterity (1-10): ");
            dexterity = input.nextInt();
        }
        points = points - dexterity;
        System.out.println("You have " + points + " left to spend.");

        System.out.print("Intelligence (1-10): ");
        int intelligence = input.nextInt();
        if (intelligence > 10 || intelligence > points) {
            System.out.print("Please input a smaller value. Intelligence (1-10): ");
            intelligence = input.nextInt();
        }
        points = points - intelligence;
        System.out.println("You have " + points + " left to spend.");

        System.out.print("Charisma (1-10): ");
        int charisma = input.nextInt();
        if (charisma > 10 || charisma > points) {
            System.out.print("Please input a smaller value. Charisma (1-10): ");
            charisma = input.nextInt();
        }
        points = points - charisma;
        System.out.println("You have " + points + " left to spend.");

        if (points > 0) {
            System.out.println("You have " + points + " to spend for next time.");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("You're a " + role + " with the following stats!");
        System.out.println("Strength - " + strength);
        System.out.println("Dexterity - " + dexterity);
        System.out.println("Intelligence - " + intelligence);
        System.out.println("Charisma - " + charisma);
        System.out.println();
        System.out.println("Good luck on your quest " + name + "!");
    }
}