/*
 Xavier Grunitzky
 Module 10.2 Assignment
 3/8/26
 This program demonstrates the use of an abstract class and subclasses.
// It creates different company divisions and displays their information.

 */
// InternationalDivision subclass
public class InternationalDivision extends Division {

    private String country;
    private String language;

    // Constructor requiring all fields
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Display method
    public void display() {
        System.out.println("International Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}