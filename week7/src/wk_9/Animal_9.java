package wk_9;
//Write a Java program to create a base class Animal with methods move() and
//        makeSound(). Create two subclasses Bird and Panthera. Override the move() method
//        in each subclass to describe how each animal moves. Also, override the makeSound()
//        method in each subclass to make a specific sound for each animal.
public class Animal_9 {
    public void move(){
        System.out.println("sprinter");
        System.out.println("fly");
    }
    public void makesound(){
        System.out.println("Panther1");
        System.out.println("Chicken1");
    }

    public static void main(String[] args) {
        Animal_9 p = new Animal_9();
        p.move();
        Animal_9 c = new Animal_9();
        c.move();
        Animal_9 p1 = new Animal_9();
        p1.makesound();
        Animal_9 c1 = new Animal_9();
    }
}
