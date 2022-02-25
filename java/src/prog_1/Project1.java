package prog_1;/*
package codes;

import java.util.Scanner;

public class Project1 {
    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        double ans = 0.0, num, radians;
        String cont;
        do {
            System.out.println("Enter the calculator mode: Standard/Scientific?");
            String calcMode = scnr.next();

            System.out.println(theCalcMode(mode(calcMode)));
            System.out.println("Do you want to start over? (Y/N)");
            do {
                cont = scnr.next();
                System.out.println(!cont.equalsIgnoreCase("Y") || !cont.equalsIgnoreCase("N"));
                if (!cont.equalsIgnoreCase("Y") || !cont.equalsIgnoreCase("N")) {
                    System.out.println("Invalid input\nDo you want to start over? (Y/N)");
                }
            } while (!cont.equalsIgnoreCase("Y") || !cont.equalsIgnoreCase("N"));

        } while (cont.equalsIgnoreCase("Y"));
    }

    public static String theCalcMode(String calcMode) {
        double ans = 0;

        String result = "";
        if (calcMode.equalsIgnoreCase("Standard")) {
            System.out.println("The calculator will operate in standard mode.\nEnter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
            do {
                opp = scnr.next();
                if ((!opp.equals("+")) && (!opp.equals("-")) && (!opp.equals("*")) && (!opp.equals("/"))) {
                    System.out.println("Invalid operator " + opp + "\nEnter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division:");
                }
            } while ((!opp.equals("+")) && (!opp.equals("-")) && (!opp.equals("*")) && (!opp.equals("/")));
            switch (opp) {
                case "+": {
                    System.out.println("How many numbers do you want to add?:");
                    int numOpp = scnr.nextInt();
                    System.out.println("Enter " + numOpp + " numbers:");
                    for (int i = 0; i < numOpp; ++i) {
                        double num = scnr.nextDouble();
                        ans += num;
                    }
                    result = "Result: " + ans;
                }
                case "-": {
                    System.out.println("How many numbers do you want to subtract?:");
                    int numOpp = scnr.nextInt();
                    System.out.println("Enter " + numOpp + " numbers:");
                    for (int i = 0; i < numOpp; ++i) {
                        double num = scnr.nextDouble();
                        ans -= num;
                    }
                    result = "Result: " + ans;
                }
                case "*": {
                    System.out.println("How many numbers do you want to multiply?:");
                    int numOpp = scnr.nextInt();
                    System.out.println("Enter " + numOpp + " numbers:");
                    for (int i = 0; i < numOpp; ++i) {
                        double num = scnr.nextDouble();
                        ans *= num;
                    }
                    result = "Result: " + ans;
                }
                case "/": {
                    System.out.println("How many numbers do you want to divide?:");
                    int numOpp = scnr.nextInt();
                    System.out.println("Enter " + numOpp + " numbers:");
                    for (int i = 0; i < numOpp; ++i) {
                        double num = scnr.nextDouble();
                        ans /= num;
                    }
                    return "Result: " + ans;
                }
            }


        } else {
            System.out.println("The calculator will operate in scientific mode.\nEnter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
            do {
                opp = scnr.next();
                if ((!opp.equals("+")) && (!opp.equals("-")) && (!opp.equals("*")) && (!opp.equals("/")) && (!opp.equals("sin")) && (!opp.equals("cos")) && (!opp.equals("tan"))) {
                    System.out.println("Invalid operator " + opp + "\nEnter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
                }
            } while ((!opp.equals("+")) && (!opp.equals("-")) && (!opp.equals("*")) && (!opp.equals("/")) && (!opp.equals("sin")) && (!opp.equals("cos")) && (!opp.equals("tan")));
            switch (opp) {
                case "+": {
                    System.out.println("How many numbers do you want to add?:");
                    int numOpp = scnr.nextInt();
                    System.out.println("Enter " + numOpp + " numbers:");
                    for (int i = 0; i < numOpp; ++i) {
                        double num = scnr.nextDouble();
                        ans += num;
                    }
                    result = "Result: " + ans;
                }
                case "-": {
                    System.out.println("How many numbers do you want to subtract?:");
                    int numOpp = scnr.nextInt();
                    System.out.println("Enter " + numOpp + " numbers:");
                    for (int i = 0; i < numOpp; ++i) {
                        double num = scnr.nextDouble();
                        ans -= num;
                    }
                    result = "Result: " + ans;
                }
                case "*": {
                    System.out.println("How many numbers do you want to multiply?:");
                    int numOpp = scnr.nextInt();
                    System.out.println("Enter " + numOpp + " numbers:");
                    for (int i = 0; i < numOpp; ++i) {
                        double num = scnr.nextDouble();
                        ans *= num;
                    }
                    result = "Result: " + ans;
                }
                case "/": {
                    System.out.println("How many numbers do you want to divide?:");
                    int numOpp = scnr.nextInt();
                    System.out.println("Enter " + numOpp + " numbers:");
                    for (int i = 0; i < numOpp; ++i) {
                        double num = scnr.nextDouble();
                        ans /= num;
                    }
                    result = "Result: " + ans;
                }
                case "sin": {
                    System.out.println("Enter the number in radians to find sin:");
                    double radians = scnr.nextDouble();
                    result = "Result: " + Math.sin(radians);
                }
                case "cos": {
                    System.out.println("Enter the number in radians to find cos:");
                    double radians = scnr.nextDouble();
                    result = "Result: " + Math.cos(radians);
                }
                case "tan": {
                    System.out.println("Enter the number in radians to find tan:");
                    double radians = scnr.nextDouble();
                    result = "Result: " + Math.tan(radians);
                }
            }
        }
        return result;
    }

    public static String mode(String mode) {
        return (mode.equalsIgnoreCase("Standard")) ? "Standard" : "Scientific";
    }

    public static String pickOperation(String mode) {
        String opp = "";
        System.out.println("The calculator will operate in " + mode + " mode.");

        do {
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division" +
                    (mode.equalsIgnoreCase("Standard") ? ":" : ", 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:"));
            opp = scnr.next();
            if ((!opp.equals("+")) && (!opp.equals("-")) && (!opp.equals("*")) && (!opp.equals("/")) && (!opp.equals("sin")) && (!opp.equals("cos")) && (!opp.equals("tan"))) {
                System.out.println("Invalid operator " + opp + "\nEnter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
            }
        } while ((!opp.equals("+")) && (!opp.equals("-")) && (!opp.equals("*")) && (!opp.equals("/")) && (!opp.equals("sin")) && (!opp.equals("cos")) && (!opp.equals("tan")));
        return opp;
    }

}


*/
