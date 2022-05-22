package prog_2.sp22.hw2;

public class Array {
    public static int sum(int[] arr) {
        return sum(arr, 0, arr.length - 1);
    }

    public static int sum(int[] arr, int firstIndex, int lastIndex) {
        // First and last index should be between 0 and array.length-1
        if (checkIndex(arr.length, firstIndex, lastIndex)) return -1;
        int sum = 0;
        for (int n = firstIndex; n <= lastIndex; n++) sum += arr[n];
        return sum;
    }

    public static double average(int[] arr) {
        return 1d * sum(arr) / arr.length;
    }

    public static double average(int[] arr, int firstIndex, int lastIndex) {
        if (checkIndex(arr.length, firstIndex, lastIndex)) return -1.0;
        return 1d * sum(arr, firstIndex, lastIndex) / (lastIndex - firstIndex + 1);
    }

    public static int maxValue(int[] arr) {
        return maxValue(arr, 0, arr.length - 1);
    }

    public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
        if (checkIndex(arr.length, firstIndex, lastIndex)) return -1;
        int maxi = arr[firstIndex];
        for (int n = firstIndex; n <= lastIndex; n++) maxi = Math.max(arr[n], maxi);
        return maxi;
    }

    public static int indexOfFirstMaxValue(int[] arr) {
        return indexOfFirstMaxValue(arr, 0, arr.length - 1);
    }

    public static int indexOfFirstMaxValue(int[] arr, int firstIndex, int lastIndex) {
        int maxi = maxValue(arr);
        if (maxi == -1) return -1;
        for (int n = firstIndex; n < lastIndex; n++) if (arr[n] == maxi) return n;
        return 0;
    }

    public static int numberOfBelowAverageElements(int[] arr) {
        return numberOfBelowAverageElements(arr, 0, arr.length - 1);
    }

    public static int numberOfBelowAverageElements(int[] arr, int firstIndex, int lastIndex) {
        double avg = average(arr, firstIndex, lastIndex);
        if (avg == -1.0) return -1;
        int counterB = 0;
        for (int i = firstIndex; i < lastIndex; i++) {
            if (arr[i] < avg) counterB++;
        }
        return counterB;
    }

    public static void rotateElements(int[] arr) { // Rotate right
        int e = arr[arr.length - 1];
        // we start from the last index to 1
        System.arraycopy(arr, 0, arr, 1, arr.length - 1);
        arr[0] = e;
    }

    public static void rotateElements(int[] arr, int rotationCount) {
        for (int n = 0; n < rotationCount; n++) rotateElements(arr);
    }

    public static void reverseArray(int[] arr) {
        for (int n = 0; n < arr.length / 2; n++) {
            int rev = arr[n];
            arr[n] = arr[arr.length - n - 1];
            arr[arr.length - n - 1] = rev;
        }
    }

    private static boolean checkIndex(int size, int a, int b) {
        return a > b || a < 0 || a >= size || b >= size;
    }

}
