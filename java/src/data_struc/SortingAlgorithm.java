package data_struc;

import java.util.Arrays;

public class SortingAlgorithm {
    public static int binarySearch(String target, String[] words) { //Q3   Needs works
    /*
        The method will search for the target in the array, and either return the
        index location where it is found, or -1 if the target is not in the array.
    */
        return google(target, words, 0, words.length - 1);

    }

    public static int google(String target, String[] words, int left, int right) {//Q3
        if (left == right && target.equals(words[left])) return left;

        int mid = left + (right - left) / 2;

        if (target.equals(words[mid]))
            return mid;
        else if (contains(target, words, mid + 1, right))  // target on right side of half
            google(target, words, mid + 1, right);
        else if (contains(target, words, left, mid - 1))  // target on left side of half
            google(target, words, left, mid - 1);

        return -1;
    }

    private static boolean contains(String target, String[] array, int left, int right) {
        String[] portion = new String[right - left];
        System.arraycopy(array, left, portion, 0, portion.length);
        return Arrays.asList(portion).contains(target);
    }

}
