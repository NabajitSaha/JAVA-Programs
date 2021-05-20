import java.lang.Math;

public class Random {
    public static void main(String[] args) {
        // Printing Random numbers
        int n = (int) (Math.random() * 100);
        System.out.println("Random Number between 000 and 100 : " + n);
        n = (int) (Math.random() * (200 - 100 + 1) + 100);
        System.out.println("Random number between 100 and 200 : " + n);
        n = (int) (Math.random() * (300 - 200 + 1) + 200);
        System.out.println("Random number between 200 and 300 : " + n);
    }
}
