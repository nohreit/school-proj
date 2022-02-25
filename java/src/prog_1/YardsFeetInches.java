package prog_1;

import java.util.Scanner;

public class YardsFeetInches {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numYards = 3;
        int numFeet = 12;
        int numInches;
        int totalYards;
        int totalFeet;
        int totalInches;
        System.out.println("Enter number of inches: ");
        numInches = scnr.nextInt();

        totalYards = numInches / (numYards * numFeet);
        totalFeet = (numInches / numFeet) % totalYards;
        totalInches = numInches % numFeet;

        System.out.println(totalYards + " yards, " + totalFeet + " feet, and " + totalInches + " inches.");
    }
}
