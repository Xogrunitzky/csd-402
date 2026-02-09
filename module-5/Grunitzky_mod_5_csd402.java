/*
Xavier Grunitzky
Module 5.2 Assignment
2/8/26

        This program will use 2 methods to find the location of largest element in array other
         2 methods will find the location of the smallest element in array.

 */
void main() {

    /*
     * Create arrays
     */
    int[][] intArray = {
            {6, 9, 4},
            {7, 0, 6}
    };

    double[][] doubleArray = {
            {1.8, 3.8},
            {9.4, 2.6}
    };

    /*
     * Call methods
     */
    int[] largestInt = locateLargest(intArray);
    int[] smallestInt = locateSmallest(intArray);

    int[] largestDouble = locateLargest(doubleArray);
    int[] smallestDouble = locateSmallest(doubleArray);

    /*
     * Output results
     */
    IO.println("Largest int location: ["
            + largestInt[0] + ", " + largestInt[1] + "]");

    IO.println("Smallest int location: ["
            + smallestInt[0] + ", " + smallestInt[1] + "]");

    IO.println("Largest double location: ["
            + largestDouble[0] + ", " + largestDouble[1] + "]");

    IO.println("Smallest double location: ["
            + smallestDouble[0] + ", " + smallestDouble[1] + "]");
}

/* ===== METHODS BELOW ===== */

public static int[] locateLargest(int[][] arrayParam) {
    int[] location = new int[2];
    int max = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] > max) {
                max = arrayParam[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;
}

public static int[] locateLargest(double[][] arrayParam) {
    int[] location = new int[2];
    double max = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] > max) {
                max = arrayParam[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;
}

public static int[] locateSmallest(int[][] arrayParam) {
    int[] location = new int[2];
    int min = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] < min) {
                min = arrayParam[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;
}

public static int[] locateSmallest(double[][] arrayParam) {
    int[] location = new int[2];
    double min = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            if (arrayParam[i][j] < min) {
                min = arrayParam[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;
}

