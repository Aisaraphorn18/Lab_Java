package lab05_01;

public class Frog extends Animal {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + ": I'm jumping.");
    }
}
