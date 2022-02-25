package prog_1;

import java.util.Scanner;

public class Homework7 {
    static Scanner scanner = new Scanner(System.in);
    static int[] grades = new int[100];
    static int numGrades;

    public static void main(String[] args) {

        do {
            numGrades = readGrades(grades);

            if (numGrades == 0) {
                break;
            }

            System.out.println("Number of Grades = " + numGrades);
/*            System.out.print("List of grades = ");
            for (int i = 0; i < numGrades; i++) { // Prints the list of grades
                System.out.print(grades[i] + " ");
            }
            System.out.println();*/

            System.out.println("Maximum Grade = " + maxValue(grades));
/*            System.out.println("Index of Maximum Grade = " + indexOfFirstMaxValue(grades));
            System.out.println("Maximum Grade = " + maxValue(grades, 5, numGrades - 1));*/
            System.out.println("Minimum Grade = " + minValue(grades));
/*            System.out.println("Index of Minimum Grade = " + indexOfFirstMinValue(grades));
            System.out.println("Minimum Grade = " + minValue(grades, 2, 5));
            System.out.println("Sum Grades = " + sum(grades));
            System.out.println("Average Grades = " + average(grades));
            System.out.println("Number of Grades below average = " + numberOfBelowAverageElements(grades));
            System.out.println("Number of Grades above average = " + numberOfAboveAverageElements(grades));*/

/*            rotateElements(grades);
            System.out.print("Array rotated once = ");
            for (int i = 0; i < numGrades; i++) {
                System.out.print(grades[i] + " ");
            }
            System.out.println();

            rotateElements(grades, 3);
            System.out.print("Array rotated n-th = ");
            for (int i = 0; i < numGrades; i++) {
                System.out.print(grades[i] + " ");
            }
            System.out.println();

            reverseArray(grades);
            System.out.print("Array reversed = ");
            for (int i = 0; i < numGrades; i++) {
                System.out.print(grades[i] + " ");
            }
            System.out.println();*/

            System.out.println();
        } while (numGrades > 0);

    }

    public static int readGrades(int[] grades) {
        int i = 0;

        while (true) {
            System.out.print("Enter a grade: ");
            int g = scanner.nextInt();

            if (g < 0) {
                break;
            } else {
                grades[i] = g;
            }
            i++;
        }
        return i;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < numGrades; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sum(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex >= numGrades || firstIndex > lastIndex) {
            return -666;
        }

        int sum = 0;
        for (int i = firstIndex; i <= lastIndex; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) / numGrades;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < numGrades; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex >= numGrades || firstIndex > lastIndex) {
            return -666;
        }
        int m = arr[0];
        for (int i = firstIndex; i <= lastIndex; i++) {
            m = Math.max(m, arr[i]);
        }
        return m;
    }

    public static int indexOfFirstMaxValue(int[] arr) {
        int max = maxValue(arr);
        for (int i = 0; i < numGrades; i++) {
            if (arr[i] == max) {
                return i;
            }
        }
        return 0;
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < numGrades; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int minValue(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex < 0 || lastIndex >= numGrades || firstIndex > lastIndex) {
            return -666;
        }
        int min = arr[0];
        for (int i = firstIndex; i <= lastIndex; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int indexOfFirstMinValue(int[] arr) {
        int min = minValue(arr);
        for (int i = 0; i < numGrades; i++) {
            if (arr[i] == min) {
                return i;
            }
        }
        return 0;
    }

    public static int numberOfBelowAverageElements(int[] arr) {
        double avg = average(arr);
        int count = 0;
        for (int i = 0; i < numGrades; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        return count;
    }

    public static int numberOfAboveAverageElements(int[] arr) {
        double avg = average(arr);
        int count = 0;
        for (int i = 0; i < numGrades; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        return count;
    }

    public static void rotateElements(int[] arr) {
        int t = arr[numGrades - 1];
        for (int i = numGrades - 1; i > 0; --i) {
            arr[i] = arr[i - 1];
        }
        arr[0] = t;
    }

    public static void rotateElements(int[] arr, int rotationCount) {
        for (int i = 1; i <= rotationCount; i++) {
            rotateElements(arr);
        }
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < (numGrades / 2); ++i) {
            int t = arr[i];
            arr[i] = arr[numGrades - (i + 1)];
            arr[numGrades - (i + 1)] = t;
        }
    }


}
