package prog_1;
/*
 * Write a program that simulates a hotel:
 * 1 - Welcome the client
 * 2 - You ask for their names
 * 3 - You ask them how many nights they are going to stay
 * 4 - Then you calculate how much they have to pay for their stay
 * 5 - You display the total amount they have to pay as input
 * 6 - Then you allow them to pay you
 * 7 - Calculate the amount of change and display it
 */

import java.util.Scanner;

public class Practice {
    public static void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Fallout Shelter, we are at your service!");
        System.out.println("Could you humble us with your name?");
        String clientName = input.next();

        System.out.printf("How many nights will you be staying here at the Fallout Shelter %s? ", clientName);
        double nightsStayed = input.nextDouble();
        double singleNightCost = 69.99;

        double total = nightsStayed * singleNightCost;

        System.out.printf("Alright %s, it will cost you %.2f pounds for your stay at the Fallout Shelter.%n", clientName, total);

        System.out.printf("If you have enough on you right now then you can pay at once, would you like to %s? (Yes or No)%n", clientName);

        String decision;
        decision = input.next();

        if (decision.equalsIgnoreCase("Yes")) {
            System.out.printf("If so, how much would you like to pay %s?%n", clientName);
            double payingSum = input.nextDouble();

            double owe = total - payingSum;
            System.out.printf("You owe %.2f pounds, you can pay the rest later. %nFor now, enjoy your stay!", owe);
        } else
            System.out.printf("No worries %s, enjoy your stay!%n", clientName);
    }
}