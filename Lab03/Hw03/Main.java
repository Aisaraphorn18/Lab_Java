public class Main {
    public static void main(String[] args) {
        Vector v = new Vector(1.5, 0.5);
        v.print();
        System.out.printf("v: length = %.2f, direction = %.2f\n", v.getLength(), v.getDirection());

        PolarVector p = v.toPolarVector();
        p.print();
        System.out.printf("p: x = %.2f, y = %.2f\n", p.getProjectionX(), p.getProjectionY());

        System.out.println("The next two lines should be equal:");
        p.toVector().print();
        v.print();
    }
}
