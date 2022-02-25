package prog_1;

import java.util.Scanner;

public class CopenhagenTransit {
    public static void transit() {
        Scanner scnr = new Scanner(System.in);
        int zoneNumber;
        String adultOrChild;
        double fare = 0.00;

        System.out.print("Enter zone number : ");
        zoneNumber = scnr.nextInt();
        System.out.print("Enter adult or child : ");
        adultOrChild = scnr.next();

        if (zoneNumber <= 2 && adultOrChild.equals("adult")) {
            fare = 23.0;
        } else if (zoneNumber <= 2 && adultOrChild.equals("child")) {
            fare = 11.50;
        } else if (zoneNumber == 3 && adultOrChild.equals("adult")) {
            fare = 34.50;
        } else if (zoneNumber == 3 || zoneNumber == 4 && adultOrChild.equals("child")) {
            fare = 23.0;
        } else if (zoneNumber == 4 && adultOrChild.equals("adult")) {
            fare = 46.0;
        } else if (zoneNumber > 4) {
            fare = -1.00;
        }

        System.out.println("The fare for " + adultOrChild + " to zone number " + zoneNumber + " is $" + fare);
    }
}