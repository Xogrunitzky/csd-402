/*
 Xavier Grunitzky
 Module 10.2 Assignment
 3/8/26
 This program demonstrates the use of an abstract class and subclasses.
// It creates different company divisions and displays their information.
 */
public abstract class Division {

    // Fields for division name and account number
    protected String divisionName;
    protected int accountNumber;

    // Constructor to initialize the fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method that will be defined in subclasses
    public abstract void display();
}