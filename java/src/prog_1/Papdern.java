package prog_1;

import java.util.Scanner;

public class Papdern {
    public static void run() {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter an integer from 1 to 9: ");
        int n = scnr.nextInt();

        for (int row = 1; row <= n; row++) { // rows
            for (int col = 1; col <= n - row; col++) // Put spaces
                System.out.print("  ");

            for (int num = row; num >= 1; num--) // Put numbers.
                System.out.print(" " + num);
            System.out.println();

        }
    }

}
