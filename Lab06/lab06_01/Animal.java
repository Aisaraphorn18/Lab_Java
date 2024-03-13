package lab06_01;

public abstract class Animal {
    private String name;
    private Point2D position;

    public Animal(String name, Point2D position) {
        this.name = name;
        this.position = position;
        
    }

    public String getName() {
        return name;
    }

    public Point2D getPosition() {
        return position;
    }
    public abstract void move();
}

