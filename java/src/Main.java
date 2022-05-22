import prog_1.Movie;

public class Main {

    public static void main(String[] args) {
        String[] a = {"a", "b", "c"};
        String[] b = {"a", "b", "c"};
        Movie m = new Movie();
        System.out.println(m.doArraysMatch(a, b));
    }
}
