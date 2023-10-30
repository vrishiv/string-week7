package hw_wk_8;

import java.util.Scanner;

//Write a java program that tells us that Input number is odd or even?
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

    }

}
