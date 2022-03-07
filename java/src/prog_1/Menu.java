package prog_1;

// I worked on this code long time ago with a student, and I don't remember what it was about nor do I have the document for the instruction

import java.util.List;
import java.util.Scanner;

public class Menu implements MenuData {
    private static final String ERMSG = "Entry incorrect!!! Please, try again...\n";
    public static Scanner scanner = new Scanner(System.in);
    static String order = ""; // to record the order of the user.
    static String name;


    public static void run() {
        String decision;

        System.out.println("Welcome to \"Your Restaurant\"\nWould you like to place an order?");

        do { // If the user gives an answer different from Yes and No
            decision = scanner.nextLine().toUpperCase(); //user says yes or no
        } while (!decision.equals("YES") && !decision.equals("NO"));

        if (decision.equals("YES")) mainMenu(); // mainMenu method call, and we go to the corresponding method.

        System.out.println("Thank you"); // waiter says thank you whether you place an order or not.

    }

    public static String iChooseYou(List<String> choiceList) {
        String order = "";
        int choice;
        do {
            choice = scanner.nextInt();

            switch (choice) {
                case 0 -> System.out.println("I changed my mind, I need nothing. Thank you.");
                case 1 -> {
                    order += choiceList.get(0);
                    order = appMenu(order); // appMenu(order) => Appetizer: [Oysters
                }
                case 2 -> {
                    order += choiceList.get(1);
                    order = mainCourseMenu(order); //method call
                }
                case 3 -> {
                    order += choiceList.get(2);
                    order = desMenu(order);
                }
                default -> System.out.println("I am sorry, we do not have that.");
            }
        } while (choice < 0 || choice > 3);
        order += "\n"; // Appetizer: [Oysters \n
        return order;
    }


    public static void mainMenu() {
        System.out.println("What is the name for your order ?");
        name = scanner.nextLine();
        System.out.printf("""
                Select from the main menu %s:
                %s
                Enter your selection [ 0 , 1 , 2 , 3]
                """, name, mainMenuStr);
        order = iChooseYou(mainMenuList);
        System.out.println(order); // display the order for the main.
    }

    public static String appMenu(String order) {
        System.out.println("previous: " + order);
        System.out.println("Appetizer menu:");
        System.out.printf("""
                %s
                Enter your selection [ 0 , 1 , 2 , 3]
                """, appetizerMenuStr);
        return iChooseYou(appMenuList); // => Appetizer: [ Oyster
    }

    public static String mainCourseMenu(String order) { // This is the main course menu method
        System.out.println("Main course menu:");
        System.out.printf("""
                %s
                Enter your selection [ 0 , 1 , 2 , 3]
                """, mainCourseMenuStr);
        return iChooseYou(mainCrsMenuList);
    }

    public static String desMenu(String order) {
        System.out.println("Dessert Menu:");
        System.out.printf("""
                %s
                Enter your selection [ 0 , 1 , 2 , 3]
                """, desMenuStr);
        return iChooseYou(desMenuList);
    }

    public static String topMenu(String order) {
        System.out.println("topMeth: " + order);
        System.out.println("Topping menu:");
        System.out.printf("""
                %s
                Enter your selection [ 0 , 1 , 2 , 3]
                """, topMenuList);
        return iChooseYou(topMenuList);
    }
}