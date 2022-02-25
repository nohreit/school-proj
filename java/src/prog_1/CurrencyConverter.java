package prog_1;

import java.util.Scanner;

public class CurrencyConverter {
    public static void convert() {
        Scanner scnr = new Scanner(System.in);

        double jamaicanCurrency = 0.0069;
        double jamaicanDollars;
        double dominicanCurrency = 0.017;
        double dominicanPeso;
        double cubanCurrency = 0.042;
        double cubanPeso;
        double totalUnitedStatesDollars;


        System.out.println("Enter number of Jamaican Dollars :");
        jamaicanDollars = scnr.nextDouble();

        System.out.println("Enter number of Dominican Pesos :");
        dominicanPeso = scnr.nextDouble();

        System.out.println("Enter number of Cuban Pesos :");
        cubanPeso = scnr.nextDouble();

        totalUnitedStatesDollars = (jamaicanCurrency * jamaicanDollars) + (cubanCurrency * cubanPeso) + (dominicanCurrency * dominicanPeso);

        System.out.printf("US Dollars = $%.2f\n", totalUnitedStatesDollars);

        scnr.close();

    }
}
