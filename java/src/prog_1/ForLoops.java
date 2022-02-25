package prog_1;

import java.util.Scanner;

public class ForLoops {
    public static void loop() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int numVal = scnr.nextInt();

        if (numVal < 0) {
            for (int i = numVal; i <= 0; i++)
                System.out.print(i + " ");
        } else {
            for (int i = 0; i <= numVal; i++)
                System.out.print((numVal - i) + " ");
        }
    }
}
