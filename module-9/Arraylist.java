/*
    Xavier Grunitzky
    Module 9.2 Assignment
    3/1/26
    This is program create an arraylist for 10 strings and prints it in a for each loop then uses a try catch to which
    will result in the user input element being displayed.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {

        // Create ArrayList with 10+ Strings
        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("cow");
        animals.add("horse");
        animals.add("rat");
        animals.add("fish");
        animals.add("snake");
        animals.add("pig");
        animals.add("pigeon");
        animals.add("goat");

        // Print using for-each loop
        System.out.println("Animal List:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        Scanner scanner = new Scanner(System.in);

        // Ask user which index they want to see again
        System.out.println("\nEnter a index number from 0-9 for the animal you want to see again:");

        String userInput = scanner.nextLine();  // User input as String

        try {
            // Convert String to Integer (Auto-Unboxing happens here)
            Integer index = Integer.parseInt(userInput);  // Autoboxing into Integer

            // Auto-unboxing occurs when used in get()
            String selectedAnimal = animals.get(index);

            System.out.println("You selected: " + selectedAnimal);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception has been thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }

        scanner.close();
    }
}
