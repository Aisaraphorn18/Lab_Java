package lab06_01;

public class Tiger extends Animal {
    public Tiger(String name, Point2D position) {
        super(name, position);
    }

    @Override
    public void move() {
        System.out.printf("%s: I'm chasing.\n", getName());
    }
}



