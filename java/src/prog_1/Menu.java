package prog_1;

// I worked on this code long time ago with a student, and I don't remember what it was about nor do I have the document for the instruction

import java.util.Scanner;

public class Menu {
    private static final String ERMSG = "Entry incorrect!!! Please, try again...\n";
    public static Scanner scanner = new Scanner(System.in);
    static String mainMenuStr = """
            0 - Nothing
            1 - Appetizer
            2 - Main Course
            3 - Dessert
            """;
    static String appetizerMenuStr = """
            0 - Nothing
            1 - Oysters
            2 - Grilled Octopus
            3 - Hummus
            """;
    static String mainCourseMenuStr = """
            0 - Nothing
            1 - Grilled Chicken Sandwich
            2 - Vegetable fried rice
            3 - White rice white and some sauce
            """;

    public static void run() {
        String decision;

        System.out.println("Welcome to \"Your Restaurant\"\nWould you like to place an order?");

        do { // If the user gives an answer different from Yes and No
            decision = scanner.nextLine().toUpperCase(); //user says yes or no
        } while (!decision.equals("YES") && !decision.equals("NO"));

        if (decision.equals("YES")) mainMenu(); // mainMenu method call, and we go to the corresponding method.

        System.out.println("Thank you"); // waiter says thank you whether you place an order or not.

    }


    public static void mainMenu() {
        String order = ""; // to record the order of the user.
        String name = "";
        int choice;
        boolean isNotDone = true;

        System.out.println("What is the name for your order ?");
        name = scanner.nextLine();

        while (isNotDone) {
            System.out.printf("""
                    Select from the main menu %s:
                    %s
                    Enter your selection [ 0 , 1 , 2 , 3]
                    """, name, mainMenuStr);

            choice = scanner.nextInt();
            switch (choice) {
                case 0 -> {
                    System.out.println("I changed my mind, I need nothing. Thank you.");
                    isNotDone = false;
                }
                case 1 -> {
                    order += "Appetizer: [";
                    order = appMenu(order); // appMenu(order) => Appetizer: [Oysters
                    isNotDone = false;
                }
                case 2 -> {
                    order += "Main Course: [";
                    order = mainCourseMenu(order); //method call
                }
                case 3 -> {
                    order += "Dessert: [";
                    order = desMenu(order);
                    isNotDone = false;
                }
                default -> {
                    System.out.println("I am sorry, we do not have that.");
                    isNotDone = false;
                }
            }
            order += "\n"; // Appetizer: [Oysters \n
        }

        System.out.println(order); // display the order for the main.
    }

    public static String appMenu(String order) {
        int choice;
        boolean isNotDone = true;
        System.out.println("previous: " + order);
        while (isNotDone) {
            System.out.printf("""
                    Appetizer menu:
                    %s
                    Enter your selection [ 0 , 1 , 2 or 3]
                    """, appetizerMenuStr);

            choice = scanner.nextInt();
            switch (choice) {
                case 0 -> order += "]";
                case 1 -> {
                    order += "Oysters: "; // => Appetizer: [ Oysters
                    order = topMenu(order); //method call
                    isNotDone = false;
                }
                case 2 -> {
                    order += "Grilled Octopus";
                    order = topMenu(order);
                    isNotDone = false;
                }
                case 3 -> {
                    order += "Hummus";
                    order = topMenu(order);
                    isNotDone = false;
                }
                default -> System.out.println(ERMSG);
            }
        }

        return order; // => Appetizer: [ Oyster
    }

    public static String mainCourseMenu(String order) { // This is the main course menu method
        int choice;
        boolean isNotDone = true;
        while (isNotDone) {
            System.out.printf("""
                    Main course menu:
                    %s
                    Enter your selection [ 0 , 1 , 2 , 3]
                    """, mainCourseMenuStr);

            choice = scanner.nextInt();
            switch (choice) {
                case 0 -> order += "]";
                case 1 -> {
                    order += "Grilled Chicken Sandwich: [";
                    order = topMenu(order);
                    isNotDone = false;
                }
                case 2 -> {
                    order += "Vegetable fried rice: [";
                    order = topMenu(order);
                    isNotDone = false;
                }
                case 3 -> {
                    order += "White rice white and some sauce: [";
                    order = topMenu(order);
                    isNotDone = false;
                }
                default -> System.out.println(ERMSG);
            }
        }

        return order;
    }

    public static String desMenu(String order) {
        int choice;
        boolean isNotDone = true;
        while (isNotDone) {
            System.out.println("Select from the main menu:\n " +
                    "0 - Nothing\n" +
                    "1 - Charlotte aux fraises\n" +
                    "2 - Takoyaki\n" +
                    "3 - Ice cream\n" +
                    "Enter your selection [ 0 , 1 , 2 , 3]"
            );

            choice = scanner.nextInt();
            switch (choice) {
                case 0 -> order += "]";
                case 1 -> {
                    order += "Charlotte aux fraises: [";
                    order = desTopMenu(order);  // return
                    isNotDone = false;
                }
                case 2 -> {
                    order += "Takoyaki: [";
                    order = desTopMenu(order);
                    isNotDone = false;
                }
                case 3 -> {
                    order += "Ice cream: [";
                    order = desTopMenu(order);
                    isNotDone = false;
                }
                default -> System.out.println(ERMSG);
            }
        }

        return order;
    }

    public static String topMenu(String order) {
        System.out.println("topMeth: " + order);
        order += " : "; // format need
        boolean isNotDone = true;

        int choice;
        do {
            System.out.println("Topping menu:\n " +
                    "0 - Nothing\n" +
                    "1 - Soy Sauce\n" +
                    "2 - Onions\n" +
                    "3 - Peppers\n" +
                    "Enter your selection [ 0 , 1 , 2 or 3]"
            );

            choice = scanner.nextInt();
            switch (choice) {
                case 0 -> order += "]"; // checking it later
                case 1 -> {
                    order += "Soy Sauce";
                    order = topMenu(order); // adding more topping;
                    isNotDone = false;
                }
                case 2 -> {
                    order += "Onions";
                    order = topMenu(order); // adding more topping;
                    isNotDone = false;
                }
                case 3 -> {
                    order += "Peppers";
                    order = topMenu(order); // adding more topping;
                    isNotDone = false;
                }
                default -> System.out.println(ERMSG);
            }

        } while (choice < 0 || choice > 3);

        return order;
    }

    public static String desTopMenu(String order) {
        order += " : ";
        int choice;
        boolean isNotDone = true;
        while (isNotDone) {
            System.out.println("Dessert topping menu:\n " +
                    "0 - Nothing\n" +
                    "1 - Strawberry\n" +
                    "2 - Pineapple\n" +
                    "3 - Cream\n" +
                    "Enter your selection [ 0 , 1 , 2 or 3]"
            );

            choice = scanner.nextInt();
            switch (choice) {
                case 0 -> order += "]";
                case 1 -> {
                    order += "Strawberry";
                    order = desTopMenu(order);
                    isNotDone = false;
                }
                case 2 -> {
                    order += "Pineapple";
                    desTopMenu(order);
                    isNotDone = false;
                }
                case 3 -> {
                    order += "Cream";
                    order = desTopMenu(order);
                    isNotDone = false;
                }
                default -> System.out.println(ERMSG);
            }
        }
        return order;
    }
}