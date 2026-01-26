/*
    Xavier Grunitzky
    Module Assignment 1.3
    1/18/26
    Find the energy needed to heat water from your initial temperature and final input temperature.
    Using the calculation: waterMass ( finalTemperature – initialTemperature ) x 4184
     */

import java.util.Scanner;

public class Grunitzky_Module1_3 {
    public static void main(String[] args) {

        System.out.println("**We will find the energy needed to heat water from your initial temperature and final input temperature.**");
        System.out.println();

        double initialTemp;
        double finalTemp;
        double waterMass;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature of the water in Celsius: ");
        initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature of the water in Celsius: ");
        finalTemp = input.nextDouble();

        double result = waterMass * (finalTemp - initialTemp) * 4184;
        System.out.printf("The energy water needed is %.2f Joules", result);

    }

}
