package prog_1;

public class FirstLoop {

    public static void run() {
        int num = 1;
        while (num <= 50) {
            if (num % 2 != 0) {
                System.out.println(num + " is an odd number");
            } else {
                System.out.println(num + " is an even number");
                System.out.println(num + " is divisible by 2");
            }
            if (num % 5 == 0) {
                System.out.println(num + " is divisible by 5");
            }
            if (num % 8 == 0) {
                System.out.println(num + " is divisible by 8");
            }
            if (num % 11 == 0) {
                System.out.println(num + " is divisible by 11");
            }
            num++;
        }

    }
}