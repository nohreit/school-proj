package prog_1;

import java.util.Scanner;

public class StringManipulation { // Final Exam

    public static void manipulateString() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String[] w = sentence.trim().split(" ");
        StringBuilder newSentence = new StringBuilder();

        for (int i = w.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                newSentence.append(w[i].toUpperCase());
            } else {
                newSentence.append(w[i].toLowerCase());
            }
            if (i > 0) {
                newSentence.append(" ");
            }
        }

        System.out.print(newSentence);
//        return newSentence;
    }
}
