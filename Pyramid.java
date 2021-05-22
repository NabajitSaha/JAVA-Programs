public class Pyramid {
    public static void main(String[] args) {
        int row = 6; // row
        int i, j;

        for (i = 0; i < row; i++) // outer loop for row 0,1, 2,3,4
        {
            for (j = row - i; j > 1; j--) // innerloop for space
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) // printing stars
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}