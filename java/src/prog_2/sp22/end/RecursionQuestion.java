package prog_2.sp22.end;

public class RecursionQuestion {

    public static int binarySearch(Car[] cars, Car c) {
        System.out.println("Looking for " + c.toString());
        int location = rec_bs(cars, 0, cars.length, c);
        if (location == -1) System.out.println("Not Found");
        return location;
    }


    private static int rec_bs(Car[] cars, int start, int end, Car target) { // The particularity of this search to work is that the array must be sorted.
        if (start < end) {
            int middle = start + (end - start) / 2; // get the middle index of the array

            System.out.printf("s=%d, e=%d, mid=%d", start, end, middle); // You don't have to use `String.format()`. This is just my preference.
            if (target.compareTo(cars[middle]) < 0) {
                System.out.println("go left");
                return rec_bs(cars, start, middle, target);
            } else if (target.compareTo(cars[middle]) > 0) {
                System.out.println("go right");
                return rec_bs(cars, middle + 1, end, target);
            } else {
                System.out.println("FOUND at " + middle);
                return middle;
            }
        }
        return -1;
    }
}
