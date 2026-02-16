/*
    Xavier Grunitzky
    Module Assignment 7.2
    2/15/26
 */

import java.util.ArrayList;

public class UseFans {

    // Display a single Fan without using toString()
    public static void displayFan(Fan fan) {

        if (fan.isOn()) {
            System.out.println("Fan is ON");
            System.out.println("Speed: " + fan.getSpeed());
        } else {
            System.out.println("Fan is OFF");
        }

        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("-----------------------");
    }

    // Display a collection of Fans
    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    // Test Code
    public static void main(String[] args) {

        // Create collection of Fan instances
        ArrayList<Fan> fanList = new ArrayList<>();

        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");
        Fan fan3 = new Fan(); // default fan

        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        // Display all fans
        displayFans(fanList);
    }
}
