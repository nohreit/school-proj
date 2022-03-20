package prog_1;

import java.util.Scanner;

public class SecondsConverter {
    public static void run() {

        Scanner scnr = new Scanner(System.in);
        int time = 0, hours = 0, minutes = 0, seconds = 0;

        System.out.println("Enter the number of seconds:");
        time = scnr.nextInt();
        if (time == 0) {
            System.out.printf(time + " seconds = %02dh:%02dm:%02ds\n", hours, minutes, seconds);
            System.out.println(time + " seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
        } else {
            hours = (time / 3600);
            minutes = ((time % 3600) / 60);
            seconds = (time % ((hours * 3600) + (minutes * 60)));
            System.out.println(time + " seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
            System.out.printf(time + " seconds = %02dh:%02dm:%02ds\n", hours, minutes, seconds);
        }
    }
}
