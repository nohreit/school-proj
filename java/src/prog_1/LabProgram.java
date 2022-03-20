package prog_1;

import java.util.Scanner;

public class LabProgram {

/*    public static void run() {
        Scanner prompt = new Scanner(System.in);
        int n;

        System.out.print("Enter a highway number: ");
        n = prompt.nextInt();
        int p = n % 100;

        if (p < 1) {
            System.out.println("Invalid highway number.");
        } else if (n < 100) {
            System.out.println("I-" + n + " is primary.");
        } else {
            System.out.print("I-" + n + " is auxiliary, serving I-" + p + ", going ");
            if (p % 2 == 0) {
                System.out.println("east/west.");
            } else {
                System.out.println("north/south.");
            }
        }
    }*/

    public static int largestNumber(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static int smallestNumber(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static void run() {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int largestNumber;
        int smallestNumber;

        System.out.println("Enter 3 integers: ");
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();

        largestNumber = largestNumber(num1, num2, num3);
        smallestNumber = smallestNumber(num1, num2, num3);

        System.out.println("The output is : " + largestNumber);
        System.out.println("The output is : " + smallestNumber);
    }

}
