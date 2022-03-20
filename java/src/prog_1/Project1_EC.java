package prog_1;/*
package codes;

public class Project_EC {
    public static void main(String[] args) {
        String mode;
        System.out.println("Enter the calculator mode: Standard/Scientific?");
        mode = keyboard.next();
        if (mode.equals("Standard")) {
            standard();
        } else if (mode.equals("Scientific")) {
            scientific();
        }
        public static void standard () {
            String operation;
            System.out.print("The calculator will operate in standard mode.");
            System.out.print(" Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
            operation = keyboard.next();
            if (operation.charAt(0) == '+') add();
            else if (operation.charAt(0) == '-') subtractions();
            else if (operation.charAt(0) == '*') division();
            else if (operation.charAt(0) == '/') multiply();
            else {
                System.out.println("Invalid operator " + operation);
                standard();
            }
        }
        public static void scientific () {
            String operation;
            System.out.print("The calculater will operate in scientific mode.");
            System.out.print("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division,
            'sin' for sin x, 'cos' for cos x, 'tan' for tan x ");
            operation = keyboard.next();
            if (operation.charAt(0) == '+') add();
            else if (operation.charAt(0) == '-') subtractions();
            else if (operation.charAt(0) == '*') division();
            else if (operation.charAt(0) == '/') multiply();
            else if (operation.charAt(0) == 's' && operation.charAt(1) == 'i' && operation.charAt(2) == 'n')
                sin();
            else if (operation.charAt(0) == '' && operation.charAt(1) == '' && operation.charAt(2) == '')
                cos();
            else if (operation.charAt(0) == '' && operation.charAt(1) == '' && operation.charAt(2) == '') tan();
            else {
                System.out.println("Invalid operator " + operation);
                scientific();
            }
        }
        public static void add () {
            double addition = 0.0;
            System.out.println("How many numbers do you want to add?");
            int times = keyboard.nextInt();
            System.out.println("Enter " + times + " numbers");
            addition += keyboard.nextDouble();
        }
        System.out.println("Result " + addition);
    }

    public static void subtractions() {
        double answer = 0.0;
        System.out.println("How many numbers do you want to subtract?");
        int times = keyboard.nextInt();
        System.out.println("Enter " + times + " numbers");
        answer = keyboard.nextDouble();
        for (int i = 1; i < times; i++) {
            answer -= keyboard.nextInt();
        }
        System.out.println("Result " + answer);
    }

    public static void multiply() {
        double multiply = 1;
        System.out.println("How many numbers do you want to multiply?");
        int times = keyboard.nextInt();
        System.out.println("Enter " + times + " numbers");
        for (int i = 1; i < times; i++) {
            multiply *= keyboard.nextDouble();
        }
        System.out.println("Result " + answer);
    }

    public static void division() {
        double division = 1;
        System.out.println("How many numbers do you want to divide?");
        int times = keyboard.nextInt();
        System.out.println("Enter " + times + " numbers");
        division = keyboard.nextDouble();
        for (int i = 1; i < times; i++) {
            division /= keyboard.nextDouble();
        }
        S
        ystem.out.println("Result " + division);
    }

    public static void sin() {
        System.out.println("Enter a number to find the sine");
        double radian = keyboard.nextDouble();
        double sine = Math.sin(radian);
        System.out.println("Result: " + sine);
    }

    public static void cos() {
        System.out.println("Enter a number to find the cosine");
        double radian = keyboard.nextDouble();
        double cosine = Math.cos(radian);
        System.out.println("Result: " + cosine);
    }

    public static void tan() {
        System.out.println("Enter a number to find the cosine");
        double radian = keyboard.nextDouble();
        double tan = Math.tan(radian);
        System.out.println("Result: " + tan);
    }

    System.put.println("Do you want to start over? (Y/N)");
    if(decision =='Y')

    {
        main(args);
    }

    else if(decision =='N')

    {
        System.out.println("Goodbye");
    }
}*/
