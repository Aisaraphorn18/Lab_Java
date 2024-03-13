package lab05_01;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + ": I'm swimming.");
    }
}

