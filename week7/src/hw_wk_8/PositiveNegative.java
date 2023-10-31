package hw_wk_8;
//Write a java program to input any number and find out if it’s odd or even.
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        int x;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number you want to check:");

        x = s.nextInt();

        if(x > 0)

        {
            System.out.println("The given number "+x+" is Positive");
        }

        else if(x < 0)
        {
            System.out.println("The given number "+x+" is Negative");
        }

        else
        {
            System.out.println("The given number "+x+" is neither Positive nor Negative ");
        }
    }
}
