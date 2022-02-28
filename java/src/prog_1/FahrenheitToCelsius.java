package prog_1;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        double fahrenheitTemperature = 0, celsiusTemperature = 0;
        System.out.println("Enter the Fahrenheit temperature as a decimal: ");
        fahrenheitTemperature = scanner.nextDouble();
        celsiusTemperature = (fahrenheitTemperature - 32) * 5 / 9;
        System.out.printf("F = %.3f, C = %.3f", fahrenheitTemperature, celsiusTemperature);
    }
}
