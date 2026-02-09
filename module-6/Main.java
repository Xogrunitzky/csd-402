/*
Xavier Grunitzky
Module 6.2 Assignment
2/8/26

This program defines a Fan object,

Creates two fan objects,

Changes their values,

Prints their current state to the screen,
 */

public class Main {
    public static void main(String[] args) {

        // Fan using default constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1:");
        System.out.println(fan1);
        System.out.println();

        // Fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 11, "purple");
        System.out.println("Fan 2:");
        System.out.println(fan2);
        System.out.println();

        // Demonstrate setters
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("green");
        fan1.setRadius(8);

        System.out.println("Fan 1 after changes:");
        System.out.println(fan1);
    }
}

