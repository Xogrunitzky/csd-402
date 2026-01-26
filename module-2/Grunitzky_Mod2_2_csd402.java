/*
    Xavier Grunitzky
    1/25/26
    Module 2.2 Assignment
    This assignment The program randomly generates the numbers 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors.
     Then, the program prompts the user to enter a value of 1, 2, or 3. Then it displays results of match.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate computer choice (1–3)
        int computerChoice = getRandomNumber(1, 4);

        // Prompt user
        System.out.print("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int userChoice = input.nextInt();

        // Display selections
        System.out.println("\nComputer chose: " + getChoiceName(computerChoice));
        System.out.println("You chose: " + getChoiceName(userChoice));

        // Determine winner
        if (computerChoice == userChoice) {
            System.out.println("Result: It's a tie!");
        } else if (
                (userChoice == 1 && computerChoice == 3) ||
                        (userChoice == 2 && computerChoice == 1) ||
                        (userChoice == 3 && computerChoice == 2)
        ) {
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        input.close();
    }

    // Random number
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    // Convert number to choice
    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";


        }
    }
}
