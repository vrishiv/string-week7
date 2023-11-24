package week_11;

import java.util.ArrayList;
import java.util.ListIterator;

//10. Write program and add all group members names in to array and iterates
//through for each loop and print your name.
public class Name_10 {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add( "Kinnari" );
        name.add( "Rutvi" );
        name.add( "Akash" );
        name.add( "Hitesh" );
        name.add( "Rushit" );
        name.add( "Alka" );
        System.out.println( "ArrayList: " + name );


        ListIterator<String> iterate = name.listIterator();
        System.out.println("Hitesh");

//        for (String:{


    }
}
