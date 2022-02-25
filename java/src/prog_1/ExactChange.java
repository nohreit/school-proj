package prog_1;

import java.util.Scanner;

public class ExactChange {
    public static void change() {
        Scanner scnr = new Scanner(System.in);
        int amount, dollars = 0, quarters = 0, dimes = 0, nickels = 0, pennies = 0;

        System.out.print("Amount: ");
        amount = scnr.nextInt();

        if (amount <= 0) {
            System.out.print("No change");
        } else {
            dollars = amount / 100;

            amount = amount % 100;

            quarters = amount / 25;

            amount = amount % 25;

            dimes = amount / 10;

            amount = amount % 10;

            nickels = amount / 5;

            pennies = amount % 5;
        }

        if (dollars >= 1) {
            if (dollars == 1) {
                System.out.print(dollars + " dollar\n");
            } else {
                System.out.print(dollars + " dollars\n");
            }
        }

        if (quarters >= 1) {
            if (quarters == 1) {
                System.out.print(quarters + " quarter\n");
            } else {
                System.out.print(quarters + " quarters\n");
            }
        }

        if (dimes >= 1) {
            if (dimes == 1) {
                System.out.print(dimes + " dime\n");
            } else {
                System.out.print(dimes + " dimes\n");
            }
        }

        if (nickels >= 1) {
            if (nickels == 1) {
                System.out.print(nickels + " nickel\n");
            } else {
                System.out.print(nickels + " nickels\n");
            }
        }

        if (pennies >= 1) {
            if (pennies == 1) {
                System.out.print(pennies + " penny\n");
            } else {
                System.out.print(pennies + " pennies\n");
            }
        }
    }
}
