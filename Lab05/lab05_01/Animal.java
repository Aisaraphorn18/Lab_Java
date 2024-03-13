package lab05_01;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move() {
        System.out.println(getName() + ": How should I move?");
    }
}