package hiteshwk_8;

//Print multiplication table of 24, 50 and 29 using loop.
import java.util.Scanner;

public class loop_1 {

    public static void main(String[] args) {
        int number;
        System.out.print( "Enter number for multiplication table:" );
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for(int i= 1; i<=10;i++)
            System.out.println(number + " * " + i + " = " +(number * i ));
    }
}
