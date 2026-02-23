import java.util.ArrayList;
import java.util.Scanner;

/*
Xavier Grunitzky
Module 8.2 Assignment
This program accepts integers from the user, stores them in an ArrayList,
and sends the ArrayList to a method that returns the largest value.
If the ArrayList is empty, the method returns 0.
*/

public class XavierArrayListTest {

    /**
     * Method that returns the largest value in an ArrayList
     * @param list ArrayList containing Integer values
     * @return largest Integer in the list or 0 if empty
     */
    public static Integer max(ArrayList list) {

        // Check if the list is null or empty
        if (list == null || list.size() == 0) {
            return 0;
        }

        // Assume the first value is the largest initially
        Integer maxValue = (Integer) list.get(0);

        // Loop through the list starting at index 1
        for (int i = 1; i < list.size(); i++) {

            // Get the current value
            Integer current = (Integer) list.get(i);

            // Compare current value with maxValue
            if (current > maxValue) {
                maxValue = current; // Update maxValue if larger number found
            }
        }

        // Return the largest value found
        return maxValue;
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        // Loop to accept user input
        while (true) {
            int input = scanner.nextInt();

            // Add input to ArrayList
            numbers.add(input);

            // Stop when user enters 0 (0 is also stored)
            if (input == 0) {
                break;
            }
        }

        // Send ArrayList to max method
        Integer largest = max(numbers);

        // Display the result
        System.out.println("The largest value is: " + largest);


        // Test with another populated list
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(10);
        testList.add(15);
        testList.add(20);

        System.out.println("Test List Largest Value: " + max(testList));

        // Close scanner
        scanner.close();
    }
}