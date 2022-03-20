package prog_1;

import java.util.Locale;
import java.util.Scanner;

public class Methods { // Homework 6

    public static void run() {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = scnr.next().charAt(0);
        scnr.nextLine();
        System.out.print("Enter a sentence: ");
        String str = scnr.nextLine();

        System.out.println(getStringTitleCase(str));
        System.out.println(getCountChar(str, c));
    }

    public static int getMaxOf2Ints(int a, int b) { // Could have used Math.max(a,b) here
        if (a > b) return a;
        else return b;
    }

    public static int getMinOf2Ints(int a, int b) { // Could have used Math.min(a,b) here
        if (a < b) return a;
        else return b;
    }

    public static int getMaxOf3Ints(int a, int b, int c) {
        return getMaxOf2Ints(a, getMaxOf2Ints(b, c));
    }

    public static int getMinOf3Ints(int a, int b, int c) {
        return getMinOf2Ints(a, getMinOf2Ints(b, c));
    }

    public static int getMedianOf3Ints(int a, int b, int c) {
        if (a < b && a > c) return a;
        else if (b < a && b > c) return b;
        return c;
    }

    public static String printMinOf3Ints(int a, int b, int c) {
        return "The min is " + getMinOf3Ints(a, b, c);
    }

    public static int getProdOfAllPositiveInts(int a) {
        int p = 1;
        for (int i = 1; i < a; i++) p *= i;
        return Math.max(p, 0);
    }

    public static int getProdOfAllNegativeInts(int a) {
        int p = 1;
        for (int i = -1; i >= a; i--) p *= i;
        return Math.min(p, 0);
    }

    public static boolean isProdOfAllPositiveIntsPositive(int a) {
        return getProdOfAllNegativeInts(a) > 0;
    }

    public static boolean isProdOfAllNegativeIntsNegative(int a) {
        return getProdOfAllNegativeInts(a) < 0;
    }

    public static char getCharAtIndex(String s, int a) {
        return (a < 0 || a >= s.length()) ? '?' : s.charAt(a);
    }

    public static int getCountChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == c)
                count++;
        }
        return count;
    }

    public static String getStringReversed(String s) {
        StringBuilder r = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) r.append(s.charAt(i));
        return r.toString();
    }

    public static String getStringTitleCase(String s) { // This from a different Homework in Fall 2021
        if (s.length() <= 0) return "";
        StringBuilder title = new StringBuilder();

        String[] words = s.toLowerCase(Locale.ROOT).split(" ");

        for (int i = 0; i < words.length; i++)
            words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);

        for (int i = 0; i < words.length; i++)
            title.append(words[i]).append((i == words.length - 1) ? "" : " ");

        return title.toString();
    }

}
