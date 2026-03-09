/*
 Xavier Grunitzky
 Module 10.2 Assignment
 3/8/26
 This program demonstrates the use of an abstract class and subclasses.
// It creates different company divisions and displays their information.

 */
public class UseDivision {

    public static void main(String[] args) {

        try {

            // International divisions
            InternationalDivision intDiv1 =
                    new InternationalDivision("China Division", 101, "China", "Mandarin");

            InternationalDivision intDiv2 =
                    new InternationalDivision("Europe Division", 102, "France", "French");

            // Domestic divisions
            DomesticDivision domDiv1 =
                    new DomesticDivision("Midwest Division", 201, "Nebraska");

            DomesticDivision domDiv2 =
                    new DomesticDivision("Southeast Division", 202, "Florida");

            // Display information
            intDiv1.display();
            intDiv2.display();
            domDiv1.display();
            domDiv2.display();

        } catch (Exception e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
}
