package week7.src.javahw7;
//Write a program for a calculator with addition, subtraction, multiplication, and division
//methods all with parameters and use string concatenation methods.

public class Ex6 {
    public void addition(int a, int b)
    {
        System.out.println("Sum of a+b = "+ (a+b));
    }
    public static void subtraction(int c,int d)
    {
        System.out.println("Difference of c and d is "+(c-d));
    }
    public void multiplication(int e, int f)
    {
        System.out.println("Multiplication of e and f is "+(e*f));
    }
    public static void division(int g, int h)
    {
        System.out.println("Division of g and h is "+(g/h));
    }
    public static void main(String[] args)
    {
        Ex6 t = new Ex6();
        t.addition( 27,9 );
        subtraction( 63,45 );
        t.multiplication( 54,18 );
        division( 108,9 );

    }
}
