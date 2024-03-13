package lab06_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();

        animals.add(new Cow("Beaver", new Point2D(100., 0.), animals));
        animals.add(new Tiger("Maxi", new Point2D(150., -10.)));
        animals.add(new Cow("Mooey", new Point2D(-10., -20.), animals));
        animals.add(new Tiger("Kitty", new Point2D(250., 200.)));

        for (var animal: animals)
            animal.move();
    }
}



