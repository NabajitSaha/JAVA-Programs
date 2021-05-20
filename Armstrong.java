public class Armstrong {
    public static void main(String[] args) {
        int n = 153; // test no.
        int temp = n;
        int t = 0;
        int a;
        System.out.println("The No. Entered for testing - " + n);
        while (n > 0) {
            a = n % 10;
            t = t + (a * a * a);
            n = n / 10;
        }
        if (t == temp)
            System.out.println("It is an Armstrong no.");
        else
            System.out.println("It is not an Armstrong no.");
    }
}