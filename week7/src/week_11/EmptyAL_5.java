package week_11;

import java.util.ArrayList;

//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
public class EmptyAL_5 {
    public static void main(String[] args)
    {
        ArrayList myArrayList = new ArrayList();
        if (myArrayList.isEmpty()) {
            System.out.println("The ArrayList is empty");
        }
        else
        {
            System.out.println("The ArrayList is not empty");
        }
    }
}
