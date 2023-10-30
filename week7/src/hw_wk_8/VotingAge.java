package hw_wk_8;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("The person is eligible to vote");
        }
    }
}
