public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Printing Left Side Triangle : ");
        int i, j;
        int row = 4;
        for (i = 0; i < row; i++) // exterior loop
        {
            for (j = (row - i); j > 0; j--) // inner loop for spacing
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) { // Printing Stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}