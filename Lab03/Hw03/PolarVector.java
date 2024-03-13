import java.text.DecimalFormat;
public class PolarVector {
    

class Vector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMagnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public double getDirection() {
        return Math.atan2(y, x);
    }

    public void print() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Vector: " + df.format(getMagnitude()) + "<" + df.format(getDirection()));
    }

    public PolarVector toPolarVector() {
        return new PolarVector(getMagnitude(), getDirection());
    }
}

class PolarVector {
    private double length;
    private double direction;

    public PolarVector(double length, double direction) {
        this.length = length;
        this.direction = direction;
    }

    public double getProjectionX() {
        return length * Math.cos(direction);
    }

    public double getProjectionY() {
        return length * Math.sin(direction);
    }

    public Vector toVector() {
        return new Vector(getProjectionX(), getProjectionY());
    }

    public void print() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("PolarVector: " + df.format(length) + "<" + df.format(direction));
    }
}

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(3, 4);
        vector.print();

        PolarVector polarVector = new PolarVector(5, Math.PI / 3);
        polarVector.print();

        // Example of converting Vector to PolarVector
        PolarVector polarFromVector = vector.toPolarVector();
        polarFromVector.print();

        // Example of converting PolarVector to Vector
        Vector vectorFromPolar = polarVector.toVector();
        vectorFromPolar.print();
    }
}

}
