public class Pattern1 {
    public static void main(String[] args) {

        System.out.println("Printing right angled triangle - ");
        int i, j;
        for (i = 0; i <= 4; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}