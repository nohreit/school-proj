package prog_1.eliza_project;

import java.util.Scanner;

public class projectELIZA {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        PromptBank promptBank = new PromptBank();
//        boolean loops;
//        String cont;
//        do {
//            loops = true;
//            System.out.println("ELIZA: Hello, my name is Eliza. What is your name?");
//
//            System.out.print("USER: ");
//            String userName = input.nextLine(); // It gets the name of the user
//
//            System.out.println("ELIZA: Hello " + userName + "! Tell me what is on your mind in one sentence.");
////            if(cont.equalsIgnoreCase("YES")) break;
//            do {
//                System.out.print("USER: ");
//                String sentence = input.nextLine(); // It gets a sentence from the user
//
//                if (!sentence.equalsIgnoreCase("EXIT")) {
//                    switch (sentence.charAt(sentence.length() - 1)) {
//                        case '?' -> System.out.println("ELIZA: " + promptBank.question(sentence));
//                        case '!' -> System.out.println("ELIZA: WOW! Dramatic! " + promptBank.statement(sentence));
//                        default -> System.out.println("ELIZA: " + promptBank.statement(sentence));
//                    }
//                } else loops = false;
//            } while (loops);
//            System.out.println("ELIZA: Do you want to run the session again?");
//            System.out.print("USER: ");
//            cont = input.nextLine();
//        } while (cont.equalsIgnoreCase("YES"));
//        System.out.println("ELIZA: Goodbye, until next time");

        PromptBank promptBank = new PromptBank();
        String cont;

        do {
            System.out.println("ELIZA: Hello, my name is Eliza. What is your name?");
            System.out.print("USER: ");
            String userName = input.nextLine(); // It gets the name of the user
            System.out.println("ELIZA: Hello " + userName + "! Tell me what is on your mind in one sentence.");
            String sentence;
            do {
                System.out.print("USER: ");
                sentence = input.nextLine(); // It gets a sentence from the user

                if (!sentence.equalsIgnoreCase("EXIT")) { // Check if the user want to exit or have a chat with Eliza.
                    switch (sentence.charAt(sentence.length() - 1)) {
                        case '?':
                            System.out.println("ELIZA: " + promptBank.question(sentence));
                            break;
                        case '!':
                            System.out.println("ELIZA: WOW! Dramatic! " + promptBank.statement(sentence));
                            break;
                        default:
                            System.out.println("ELIZA: " + promptBank.statement(sentence));
                    }
                }

            } while (!sentence.equalsIgnoreCase("EXIT"));

            System.out.println("ELIZA: Do you want to run the session again?");
            System.out.print("USER: ");
            cont = input.next();
        } while (cont.equalsIgnoreCase("YES"));
        System.out.println("ELIZA: Goodbye, until next time");
    }
}
