package lab06_01;

import java.util.ArrayList;

public class Cow extends Animal {
    private ArrayList<Animal> allAnimals;

    public Cow(String name, Point2D position, ArrayList<Animal> allAnimals) {
        super(name, position);
        this.allAnimals = allAnimals;
    }

    @Override
    public void move() {
        boolean tigerNearby = false;
        for (Animal animal : allAnimals) {
            if (animal instanceof Tiger) {
                double distanceToTiger = this.getPosition().distance(animal.getPosition());
                if (distanceToTiger <= 100) {
                    tigerNearby = true;
                    break;
                }
            }
        }
        if (tigerNearby) {
            System.out.printf("%s: I can't move. I'm scared.\n", getName());
        } else {
            System.out.printf("%s: I'm walking.\n", getName());
        }
    }
}


