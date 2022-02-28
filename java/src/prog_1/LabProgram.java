package prog_1;

import java.util.Scanner;

public class LabProgram {

//    public static void main(String[] args) {
//        Scanner prompt = new Scanner(System.in);
//        int n;
//
//        System.out.print("Enter a highway number: ");
//        n = prompt.nextInt();
//        int p = n % 100;
//
//        if (p < 1) {
//            System.out.println("Invalid highway number.");
//        } else if (n < 100) {
//            System.out.println("I-" + n + " is primary.");
//        } else {
//            System.out.print("I-" + n + " is auxiliary, serving I-" + p + ", going ");
//            if (p % 2 == 0) {
//                System.out.println("east/west.");
//            } else {
//                System.out.println("north/south.");
//            }
//        }
//    }

    public static int largestNumber(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static int smallestNumber(int num1, int num2, int num3) {

        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void run(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int largestNumber;
        int smallestNumber;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();

        largestNumber = largestNumber(num1, num2, num3);
        smallestNumber = smallestNumber(num1, num2, num3);

        System.out.println("The output is : " + largestNumber);
        System.out.println("The output is : " + smallestNumber);
    }

}
