public class Prime {
    public static void main(String[] args) {
        int n = 5; // no. for test
        int c = 0;

        if (n == 1 || n == 0) {
            System.out.println("It is not a prime no. ");
        }

        else

        {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0)
                    c++;
            }
            if (c == 1)
                System.out.println("It is a prime no.");
            else
                System.out.println("It is not a prime no.");
        }
    }
}
