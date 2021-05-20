import java.util.Random;

public class Random3 {
    public static void main(String[] args) {
        randomInts(5);
        randomInts(9, 50, 90);
    }

    public static void randomInts(int n) {
        Random r = new Random();
        r.ints(n).forEach(System.out::println);
    }

    public static void randomInts(int a, int b, int c) {
        Random r = new Random();
        r.ints(a, b, c).forEach(System.out::println);
    }
}
