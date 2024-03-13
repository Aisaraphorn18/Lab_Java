package lab05_01;

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + ": I'm flying.");
    }
}
