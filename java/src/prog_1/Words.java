package prog_1;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String w1, w2, w3, w4;

        System.out.println("Enter 4 words:");
        w1 = scnr.next();
        w2 = scnr.next();
        w3 = scnr.next();
        w4 = scnr.next();

        System.out.println("Word 1 = \"" + w1 + "\" Length = " + w1.length() + " position of vowels: " + " 'a' = "
                + w1.indexOf('a') + ", 'e' = " + w1.indexOf('e') + ", 'i' = " + w1.indexOf('i') + ", 'o' = "
                + w1.indexOf('o') + ", 'u' = " + w1.indexOf('u'));
        System.out.println("Word 2 = \"" + w2 + "\" Length = " + w2.length() + " position of vowels: " + " 'a' = "
                + w2.indexOf('a') + ", 'e' = " + w2.indexOf('e') + ", 'i' = " + w2.indexOf('i') + ", 'o' = "
                + w2.indexOf('o') + ", 'u' = " + w2.indexOf('u'));
        System.out.println("Word 3 = \"" + w3 + "\" Length = " + w3.length() + " position of vowels: " + " 'a' = "
                + w3.indexOf('a') + ", 'e' = " + w3.indexOf('e') + ", 'i' = " + w3.indexOf('i') + ", 'o' = "
                + w3.indexOf('o') + ", 'u' = " + w3.indexOf('u'));
        System.out.println("Word 4 = \"" + w4 + "\" Length = " + w4.length() + " position of vowels: " + " 'a' = "
                + w4.indexOf('a') + ", 'e' = " + w4.indexOf('e') + ", 'i' = " + w4.indexOf('i') + ", 'o' = "
                + w4.indexOf('o') + ", 'u' = " + w4.indexOf('u'));
    }
}
