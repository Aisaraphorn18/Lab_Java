package lab03_01;

public class Main {
    public static void main(String[] args) {
        Vector u = new Vector(1., 1.);
        Vector v = new Vector(-0.5, 0.5);

        u.print();
        v.print();

        System.out.printf("v: length = %.2f, direction = %.2f\n", v.getLength(), v.getDirection());
        System.out.printf("u . v = %.2f\n", u.dot(v));

        Vector unit = u.getUnitVector();
        unit.print();
    }
}

