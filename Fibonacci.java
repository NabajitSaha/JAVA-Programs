public class Fibonacci
{
 public static void main (String [] args)
{   int c;
    System.out.println("Printing Fibonacci till 10 times - "); // 0 1 1 2 3 5 8 13 
    int a=0,b=1; 
    int t;
    System.out.print(a +" "+b+" ");
    for (c=0;c<10;c++)
    {
        t=a+b; // 1 2 
        System.out.print(t+ " ");   
        a=b; // 1 2
        b=t; // 1 1
    }
 }
}