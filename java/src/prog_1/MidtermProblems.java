package prog_1;

public class MidtermProblems {
    public static void run() {
        float x = 1, y = 2, z = 3;
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

    // Problem 2 (Shorter)
    public static String difference(int a, int b) {
        if (a > b) return "a is bigger by " + (a - b) + "";
        if (a < b) return "b is bigger by " + (b - a) + "";
        return "EQUAL";
    }


    // Problem 3 (Shorter)
    public static String odds(int a) {
        if (a == 0) return "";
        if (a < 0) return "NONE";
        StringBuilder str = new StringBuilder();
        a = (a % 2 == 0) ? a - 1 : a;
        for (int i = 1; i <= a; i++)
            if (i % 2 == 1) str.append(i).append((i < a) ? "," : "");
        return str.toString();
    }


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

    /* The comment below is to explain in a more detailed way the above methods
    // Problem 1
    public static String replaceFirst(String s, char c) {
        if (s == null) { // check if the passed string is null
            return null; // returns null and get out of the function
        }
        if (s.equals("")) { // check if the passed string is empty
            return ""; // returns an empty string and get out of the function
        }

        String str;
        //str = 't' + "ake"
        str = c + s.substring(1);

        return str;
    }

    // Problem 2
    public static String difference(int a, int b) { // calculate the difference between a and b
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
    }

    // Problem 3
    public static String odds(int a) { // returns a string
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
    }

    // Problem 4
    public static int sumAll(int a, int b) {
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
}
