package prog_2.sp22.end;

import java.util.Scanner;

public class RecursionQuestion {

    public static int binarySearch(Car[] cars, Car c) {
        System.out.println("Looking for " + c.toString() + "\n");
        return rec_bs(cars, 0, cars.length, c);
    }


    private static int rec_bs(Car[] cars, int start, int end, Car target) { // The particularity of this search to work is that the array must be sorted.
        if (start < end) {
            int middle = start + (end - start) / 2; // get the middle index of the array

            System.out.printf("s=%d, e=%d, mid=%d\n", start, end, middle); // You don't have to use `String.format()`. This is just my preference.
            if (target.compareTo(cars[middle]) < 0) {
                System.out.println("go left");
                return rec_bs(cars, start, middle, target);
            } else if (target.compareTo(cars[middle]) > 0) {
                System.out.println("go right");
                return rec_bs(cars, middle + 1, end, target);
            } else {
                return middle;
            }
        }
        return -1;
    }

    //do not remove main method or its content
    public static void main(String[] args) {
        Car[] cars = new Car[10];
        int[][] seatConfigurations = {new int[]{2, 2}, new int[]{2, 3},
                new int[]{2, 2, 3}, new int[]{2, 3, 3}, new int[]{2, 3, 4}, new int[]{2, 4, 3},
                new int[]{2, 3, 5}, new int[]{2, 4, 4}, new int[]{2, 4, 5}, new int[]{3, 4, 5}};
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(2, 4, seatConfigurations[i]);
        }
        Scanner kb = new Scanner(System.in);
//        System.out.print("Enter seat info: ");   //uncomment only when testing on your local system
        String[] input = kb.nextLine().split(" ");
        int[] rowSeats = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            rowSeats[i] = Integer.parseInt(input[i]);
        }

        int index = binarySearch(cars, cars[0]);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("FOUND at " + index);
        }


    }
}
