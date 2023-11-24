package week_11;

import java.util.ArrayList;
import java.util.ListIterator;

//Write program and add all group names in to array and iterates through for
//each loop.
public class Group_9 {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        group.add("Agile");
        group.add("Selenium");
        group.add("Scrum");
        group.add("Postman");
        group.add("Java");
        System.out.println("ArrayList: " + group);


        ListIterator<String> iterate = group.listIterator();
        System.out.println("Iterating over ArrayList:");
        while(iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
    }
}

