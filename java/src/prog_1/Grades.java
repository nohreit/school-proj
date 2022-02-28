package prog_1;

import java.util.Arrays;
import java.util.Scanner;

public class Grades { // Homework 7
    static Scanner scanner = new Scanner(System.in);
    static int[] grades = new int[100];
    static int numGrades;

    public static void run() {
        do {
            numGrades = readGrades(grades);
            if (numGrades == 0) break;
            System.out.println("Number of Grades = " + numGrades);
            System.out.println("Maximum Grade = " + maxValue(grades));
            System.out.println("Maximum Grade(0," + numGrades / 2 + ") = "
                    + maxValue(grades, 0, numGrades / 2));
            System.out.println("Minimum Grade = " + minValue(grades));
            System.out.println("Minimum Grade(0," + numGrades / 2 + ") = "
                    + minValue(grades, 0, numGrades / 2));
            System.out.println("Minimum Grade = " + sum(grades));
            System.out.println("Minimum Grade(0," + numGrades / 2 + ") = "
                    + sum(grades, 0, numGrades / 2));
            System.out.println("Index of first min value = " + indexOfFirstMinValue(grades));
            System.out.println("Index of first max value = " + indexOfFirstMaxValue(grades));
            System.out.println("Average Grade = " + average(grades));
            System.out.println("Number of grades below average = " + numberOfBelowAverageElements(grades));
            System.out.println("Number of grades above average = " + numberOfAboveAverageElements(grades));
            rotateElements(grades);
            System.out.println("List of grades after one clockwise rotation = " + Arrays.toString(grades));
            rotateElements(grades, 3);
            System.out.println("List of grades after one clockwise rotation = " + Arrays.toString(grades));
            reverseArray(grades);
            System.out.println("List of grades reversed = " + Arrays.toString(grades));
            System.out.println();
        } while (numGrades > 0);
    }

    public static int readGrades(int[] grades) {
        int i = 0;
        System.out.println("Enter a grade: ");
        while (true) {
            int g = scanner.nextInt();
            if (g < 0) break;
            else grades[i] = g;
            i++;
        }
        return i;
    }

    public static int sum(int[] arr) {
        return sum(arr, 0, numGrades - 1);
    }

    public static int sum(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex >= numGrades || firstIndex > lastIndex) return -666;
        int sum = 0;
        for (int i = firstIndex; i <= lastIndex; i++) sum += arr[i];
        return sum;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) / numGrades;
    }

    public static int maxValue(int[] arr) {
        return maxValue(arr, 0, numGrades - 1);
    }

    public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex >= numGrades || firstIndex > lastIndex) return -666;
        int max = arr[0];
        for (int i = firstIndex; i <= lastIndex; i++) max = Math.max(max, arr[i]);
        return max;
    }

    public static int indexOfFirstMaxValue(int[] arr) {
        int max = maxValue(arr);
        for (int i = 0; i < numGrades; i++)
            if (arr[i] == max) return i;
        return 0;
    }

    public static int minValue(int[] arr) {
        return minValue(arr, 0, numGrades - 1);
    }

    public static int minValue(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex >= numGrades || firstIndex > lastIndex) return -666;
        int min = arr[0];
        for (int i = firstIndex; i <= lastIndex; i++) min = Math.min(min, arr[i]);
        return min;
    }

    public static int indexOfFirstMinValue(int[] arr) {
        int min = minValue(arr);
        for (int i = 0; i < numGrades; i++)
            if (arr[i] == min) return i;
        return 0;
    }

    public static int numberOfBelowAverageElements(int[] arr) {
        double avg = average(arr);
        int count = 0;
        for (int i = 0; i < numGrades; i++)
            if (arr[i] < avg) count++;
        return count;
    }

    public static int numberOfAboveAverageElements(int[] arr) {
        double avg = average(arr);
        int count = 0;
        for (int i = 0; i < numGrades; i++)
            if (arr[i] > avg) count++;
        return count;
    }

    public static void rotateElements(int[] arr) {
        int t = arr[numGrades - 1];
        System.arraycopy(arr, 0, arr, 1, numGrades - 1);
        arr[0] = t;
    }

    public static void rotateElements(int[] arr, int rotationCount) {
        for (int i = 1; i <= rotationCount; i++) rotateElements(arr);
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < (numGrades / 2); ++i) {
            int t = arr[i];
            arr[i] = arr[numGrades - (i + 1)];
            arr[numGrades - (i + 1)] = t;
        }
    }
}
