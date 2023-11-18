package Week9;
//Write a Java program that takes the user to provide a single character from the
//        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
//        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
//        error message.

import java.util.Scanner;

public class Alphabat_3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
    }
}
