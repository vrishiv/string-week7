package hiteshwk_8;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class SumOfNumbers {
    public static void main(String[] args) {
//        int n1 = 108, n2 = 27, sum;
//        sum = n1 + n2;
//        System.out.println("The sum of numbers is: "+sum);
        int a, b, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        sum = sum(a, b);
        System.out.printf( "The sum of two numbers x and y is: %d%n", sum );
    }
}
