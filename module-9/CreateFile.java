/*
    Xavier Grunitzky
    Module 9.2 Assignment
    3/1/26
    This program create a file if it is not already created and adds to file and then read it back.
 */
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;       // Import the File class
import java.io.IOException; // Import IOException to handle errors
import java.util.Random;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        File myObj = new File("data.file"); // Create File object
        try {

            if (myObj.createNewFile()) {           // Try to create the file
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print error details
        }

        // true = append mode
        Random random = new Random();

        try (FileWriter myWriter = new FileWriter("data.file", true)) {

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(10) + 1; // 1–10
                myWriter.write(number + " ");       // space between numbers
            }

            System.out.println("Successfully appended to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
