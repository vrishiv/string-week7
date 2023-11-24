package week_11;

import java.util.ArrayList;

public class Array_Animals {
    public static void main(String[] args) {


        ArrayList<String> animal = new ArrayList<>();
        animal.add( "Cow" );
        animal.add( "Dog" );
        animal.add( "Cat" );
        animal.add("Camel");
        animal.add("Goat");
        animal.add("Horse");
        String str = animal.remove(3);


        System.out.println("Array list" +animal);
        System.out.println("updated Array list :" +animal);
        System.out.println("removed animal :"+ str);


    }
}
