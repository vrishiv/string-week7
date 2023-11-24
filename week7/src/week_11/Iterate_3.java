package week_11;

import java.util.ArrayList;
import java.util.ListIterator;

//Write a Java program to iterate through all elements in an array list using
//Iterator.
public class Iterate_3 {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cow");
        animals.add("Camel");
        animals.add("Dog");
        animals.add("Horse");
        System.out.println("ArrayList: " + animals);


        ListIterator<String> iterate = animals.listIterator();
        System.out.println("Iterating over ArrayList:");
        while(iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
    }
}
