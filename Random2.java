import java.util.Random;

public class Random2 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(50);
        System.out.println("Printing random number using nextInt() : " + n);
        double d = r.nextDouble();
        System.out.println("Printing random number using nextDouble() : " + d);

    }

}
