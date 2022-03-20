package prog_1;

public class Something { // I don't remember what it was about ¯\_(ツ)_/¯

    public static String getStringTitleCased(String s) {
        if (s.isEmpty()) {
            return "";
        }

        String[] upperCase = s.trim().split(" ");
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < upperCase.length; i++) {
            str.append(Character.toUpperCase(upperCase[i].charAt(0)))
                    .append(upperCase[i].substring(1))
                    .append(i == upperCase.length - 1 ? "" : " ");
        }

        return str.toString();
    }

    public static void run() {

        String str = "java is hard. but i am practicing it. i wish to be the best coder ever.";
        System.out.println("String: " + getStringTitleCased(str));
    }
}
