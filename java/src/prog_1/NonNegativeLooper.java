package prog_1;

import java.util.Scanner;

public class NonNegativeLooper {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userNum = scnr.nextInt();

        while (userNum > 1)
            System.out.print((userNum /= 2) + " ");
    }
}
