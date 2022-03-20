package prog_1;

import java.util.Scanner;

public class Odds {
    static Scanner scnr = new Scanner(System.in);

    public static void run() {

        System.out.println(odds(0));
        System.out.println(odds(-5));
        System.out.println(odds(1));
        System.out.println(odds(16));
        System.out.println(odds(19));
    }

    private static String odds(int a) {
        if (a == 0) return "\"\"";
        if (a < 0) return "\"NONE\"";
        if (a % 2 == 0) a -= 1;
        StringBuilder str = new StringBuilder("\"");
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                str.append(i);
                if (i == a){
                    str.append("\"");
                }else{
                    str.append(",");
                }
            }
        }
        return str.toString();
    }
}
