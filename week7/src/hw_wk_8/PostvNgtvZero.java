package hw_wk_8;

import java.util.Scanner;

public class PostvNgtvZero {
    public static void main(String[] args) {
        int x;

        Scanner s = new Scanner(System.in);

        System.out.print("Number below is:");

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
