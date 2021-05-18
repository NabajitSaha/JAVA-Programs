public class Factorial {
    public static void main(String[] args) {
        int n = 4; // test no.
        int m = 1;

        for (int i = 1; i <= n; i++) {
            m = m * i;
        }
        System.out.println("Factorial of " + n + " = " + m);
    }

}