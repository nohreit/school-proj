package prog_1;

import java.util.Scanner;

public class Papdern {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter an integer from 1 to 9: ");
        int n = scnr.nextInt();

        for (int row = 1; row <= n; row++) { // rows
            for (int col = 1; col <= n - row; col++) { // Put spaces
                System.out.print("  ");
            }

            for (int num = row; num >= 1; num--) { // Put numbers.
                System.out.print(" " + num);
            }
//            for (int num = 1; num <= n - (n - row); num++) { // Put numbers. or cols
//                System.out.print(num + " ");
//            }

//            for (int num = 1; num <= n - row; num++) { // Put numbers.
//                System.out.print(num + " ");
//            }
            System.out.println();

        }
    }

}
