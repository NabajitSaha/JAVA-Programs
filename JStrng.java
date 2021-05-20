public class JStrng
{
    public static void main(String [] args )
    {
        String txt1 = "Hello";
        String txt2 = "World";

        System.out.println("Concat - a+b = "+txt1+txt2);
        System.out.println("Concat using .concat() - "+txt1.concat(txt2));
        System.out.println("Length - "+txt1.concat(txt2).length());
        System.out.println("index of First 'L' - "+txt1.indexOf('l'));
        System.out.println("Using \n as new line command ");
        System.out.println();
        System.out.println("Using \r as carraige return ");
        System.out.println();
        System.out.println("Using \t for tab in line ");
        System.out.println();
        System.out.println("Using \bfor backspace in line");
    }

}