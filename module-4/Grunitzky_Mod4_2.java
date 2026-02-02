/*
Xavier Grunitzky
Module 4 Assignment
2/1/26
This is program will take 4 methods and then displays the average value returned. 
*/


public class AverageTest {

    // Returns the average of a short array
    public static short average(short[] array) {
        int sum = 0;
        for (short s : array) {      // add each element to sum
            sum += s;
        }
        return (short) (sum / array.length);
    }

    // Returns the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    // Returns the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long l : array) {
            sum += l;
        }
        return sum / array.length;
    }

    // Returns the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double d : array) {
            sum += d;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {

        // Create arrays of different sizes
        short[] shortArray = {5, 10, 15};
        int[] intArray = {20, 40, 60, 80};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {1.5, 3.5, 5.5, 7.5, 9.5, 11.5};

        // Display short array and its average
        System.out.print("Short Array: ");
        for (short s : shortArray) {
            System.out.print(s + " ");
        }
        System.out.println("\nAverage: " + average(shortArray) + "\n");

        // Display int array and its average
        System.out.print("Int Array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println("\nAverage: " + average(intArray) + "\n");

        // Display long array and its average
        System.out.print("Long Array: ");
        for (long l : longArray) {
            System.out.print(l + " ");
        }
        System.out.println("\nAverage: " + average(longArray) + "\n");

        // Display double array and its average
        System.out.print("Double Array: ");
        for (double d : doubleArray) {
            System.out.print(d + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
    }
}
