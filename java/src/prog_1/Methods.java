package prog_1;

import java.util.Scanner;

public class Methods { // Homework 6

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = scnr.next().charAt(0);
        scnr.nextLine();
        System.out.print("Enter a sentence: ");
        String str = scnr.nextLine();

//        System.out.print("Enter a number: ");
//        int idx = scnr.nextInt();

        System.out.println(getStringTitleCase(str));
        System.out.println(getCountChar(str, c));
//        System.out.println(getCharAtIndex(str, idx));
    }


    public static String getStringTitleCase(String s) {
        if (s.length() <= 0) {
            return "";
        }

        String title = "";
//
//        s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
//
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == ' ') {
//                title += " " + String.valueOf(s.charAt(i+1)).toUpperCase();
//                i++; //
//            }else{
//                title += Character.toLowerCase(s.charAt(i));
//            }
//        }

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
        }

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                title += words[i];
            } else {
                title += words[i] + " ";
            }
        }

        return title;
    }

    public static char getCharAtIndex(String s, int a) {
        if (a < 0 || a >= s.length()) {
            return '?';
        }

        return s.charAt(a);
    }

    public static int getCountChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == c)
                count++;
        }
        return count;
    }


}
