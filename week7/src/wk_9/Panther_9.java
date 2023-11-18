package wk_9;

public class Panther_9 extends Animal_9 {
    public void move(){
        System.out.println("Panther");
    }

    public void makesound() {
        System.out.println("rroooaaarrrr");

    }

    public static void main(String[] args) {
        Panther_9 p = new Panther_9();
        Panther_9 p1 = new Panther_9();
        p.move();
        p1.makesound();
    }
}
