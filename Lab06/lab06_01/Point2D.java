package lab06_01;

public class Point2D {
    protected double x;
    protected double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point2D p) {
        double dx = p.x - x;
        double dy = p.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}


