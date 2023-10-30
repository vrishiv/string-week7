package hiteshwk_8;
//Take values of length and breadth of a rectangle
// from user and check if it is square or not.

import java.util.Scanner;

public class LngthBrth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length: ");
        int len =sc.nextInt();
        System.out.println("Enter Breadth");
        int breadth =sc.nextInt();
        if(len == breadth)
            System.out.println("It is a Square.");
        else
            System.out.println("It is a rectangle.");

    }
}
