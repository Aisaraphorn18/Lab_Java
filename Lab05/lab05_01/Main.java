package lab05_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();

        animals.add(new Fish("Nemo"));
        animals.add(new Frog("Kermit"));
        animals.add(new Bird("Twitty"));
        animals.add(new Cat("Kitty", 1));
        animals.add(new Cat("Ginger", 3));

        for (var animal: animals)
            animal.move();
    }
}

