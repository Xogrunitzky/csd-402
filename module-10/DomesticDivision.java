/*
 Xavier Grunitzky
 Module 10.2 Assignment
 3/8/26
 This program demonstrates the use of an abstract class and subclasses.
// It creates different company divisions and displays their information.

 */
public class DomesticDivision extends Division {
    private String state;

    // Constructor requiring all fields
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Display method
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
