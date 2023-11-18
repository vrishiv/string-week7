package wk_9;

public class Bird_9 extends Animal_9 {
    public void move(){
        System.out.println("Chicken");
    }

    public void makesound() {
        System.out.println("cluck-cluck");

    }

    public static void main(String[] args) {
        Bird_9 c = new Bird_9();
        Bird_9 c1 = new Bird_9();
        c.move();
        c1.makesound();
    }
}
