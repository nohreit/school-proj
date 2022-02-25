package prog_1;

public class MidtermProblems {
    public static void main(String[] args) {
/*        pln("Problem 1 Test");
        pln(replaceFirst("make", 't'));
        pln(replaceFirst("a", 'x'));
        pln("Problem 2 Test\n");
        pln(difference(89, 56));
        pln(difference(56, 89));
        pln(difference(70, 64));
        pln(difference(64, 70));
        pln(difference(43, 43));
        pln("Problem 3 Test\n");
        pln(odds(5));
        pln(odds(8));
        pln(odds(9));
        pln(odds(-5));
        pln(odds(0));
        pln(odds(1));
        pln("Problem 4 Test\n");
        pln(sumAll(2, 5));
        pln(sumAll(5, 2));
        pln(sumAll(3, 3));
        pln(sumAll(3, 5));
        pln(sumAll(-4, 3));
        pln(sumAll(-4, 2));
        pln(sumAll(-5, -2));
        pln(sumAll(-5, 2));
        pln(sumAll(-2, 5));
        pln(sumAll(-5, -3));
        pln(sumAll(3, -5));
        pln(sumAll(-3, 5));
*/

        float x = 1, y = 2, z = 3;
/*

        int totalNum2 = Math.pow(Math.pow(x(y, z)));
        int totalNum3 = Math.abs(y(Math.pow(z)Math.sqrt(xy)));
*/
        System.out.println(Math.pow(x, z));
        System.out.println(Math.pow(x, Math.pow(y, z)));
        System.out.println(Math.abs(y));
        System.out.println(Math.sqrt(Math.pow(x * y, z)));

    }

    // Problem 1 (Shorter)
    public static String replaceFirst(String s, char c) {
        if (s == null) return null;
        if (s.equals("")) return "";
        return s.replaceFirst(Character.toString(s.charAt(0)), Character.toString(c));

    }

    // Problem 1
    /*public static String replaceFirst(String s, char c) {
        if (s == null) {
            return null;
        }
        if (s.equals("")) {
            return "";
        }

        String str;
//        str = 't' + "ake"
        str = c + s.substring(1);

        return str;
    }*/

    // Problem 2 (Shorter)
    public static String difference(int a, int b) {
        if (a > b) return "a is bigger by " + (a - b) + "";
        if (a < b) return "b is bigger by " + (b - a) + "";
        return "EQUAL";
    }

    // Problem 2
    /*public static String difference(int a, int b) {
        String str;
        int diff;
        if (a > b) {
            diff = a - b;
            str = "a is bigger by " + diff + "";
        } else if (b > a) { // or a < b
            diff = b - a;
            str = "b is bigger by " + diff + "";
        } else { // if (a == b)
            str = "EQUAL";
        }
        return str;
    }*/

    // Problem 3 (Shorter)
    public static String odds(int a) {
        if (a == 0) return "";
        if (a < 0) return "NONE";
        StringBuilder str = new StringBuilder("");
        a = (a % 2 == 0) ? a - 1 : a;
        for (int i = 1; i <= a; i++)
            if (i % 2 == 1) str.append(i).append((i < a) ? "," : "");
        return str.append("").toString();
    }

    // Problem 3
    /*public static String odds(int a) {
        String str = "";
        if (a < 0) {
            return "NONE";
        }
        if (a == 0) {
            return "";
        }

        if (a % 2 == 1) { // check if a is odd to include it in our string
            for (int i = 1; i <= a; ++i) { // a is included in the list
                if (i % 2 == 1 && i < a) { // i is odd and i is less than a
                    str += i + ",";
                }
                if (i % 2 == 1 && i == a) { // i is odd and i is equal to a
                    str += i;
                }
            }
        }
        if (a % 2 == 0) { // check if a is even to exclude it off our string
            for (int i = 1; i < a; ++i) { // a is excluded off the list
                if (i % 2 == 1 && i < a - 1) { // i is odd and i is less than a -1 (before the last odd number)
                    str += i + ",";
                }
                if (i % 2 == 1 && i == a - 1) {  // i is odd and i equals a - 1 (the last odd number)
                    str += i;
                }
            }
        }

        str += "";

        return str;
    }*/

    // Problem 4 (Shorter)
    public static int sumAll(int a, int b) {
        int sum = 0;
        if (a < b)
            for (int i = a; i <= b; i++)
                sum += i;
        else if (a > b)
            for (int i = b; i <= a; i++)
                sum += i;
        else sum = a + b;
        return sum;
    }

    // Problem 4
    /*public static int sumAll(int a, int b) {
        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        } else { // a == b
            sum = a + b; // a+=b
        }

        return sum;
    }*/

    public static void pln(Object o) {
        System.out.println(o);
    }

    public static void p(Object o) {
        System.out.println(o);
    }
}
