package javahw7;

public class Ex5 {
     static int a = 5;
    static int b = 10;

    static int c = (a+b);

    public Ex5(int i) {
    }

    public static void main(String[] args)
    {
        int x = 7;
        int y = 9;
        int z = 5;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(y+z-x);


        Ex5 obj = new Ex5(a+b);
        System.out.println(obj.c);
        
    }

    public static class Ex6 {
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
}
