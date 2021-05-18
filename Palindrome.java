public class Palindrome {
    public static void main(String[] args)

    {
        int n = 202; // test no.
        int a;
        int temp = n;
        int tot = 0;
        System.out.println("Checking if " + n + " is Pallindrome or not : ");
        while (n > 0) {

            a = n % 10; // getting remainder
            tot = (tot * 10) + a;
            n = n / 10;
        }

        if (tot == temp)
            System.out.println(" Pallindrome ");
        else
            System.out.println("Not a Pallindrome ");
    }
}