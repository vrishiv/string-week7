package wk_9;
//Write a Java program to create a base class Animal (Animal Family) with a method
//        called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
//        each subclass to make a specific sound for each animal.

public class AnimalFamily_6 {
    public void sound (){
        System.out.println("chi-chi");
        System.out.println("meow-meow");
    }
    public static void main(String[] args) {
        AnimalFamily_6 s = new AnimalFamily_6();
        s.sound();
        AnimalFamily_6 c = new AnimalFamily_6();
        c.sound();
    }
}
