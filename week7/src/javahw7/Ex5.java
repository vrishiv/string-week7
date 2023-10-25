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
}
