package wk_9;
//Write a Java program to create a class Vehicle with a method called speedUp(). Create
//        two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
//        increase the vehicle's speed differently.

public class Vehicle_7 {
    public void speedup(){
        System.out.println("fast");
        System.out.println("slow");

    }

    public static void main(String[] args) {
        Vehicle_7 c = new Vehicle_7();
        Vehicle_7 b = new Vehicle_7();
    }
}
