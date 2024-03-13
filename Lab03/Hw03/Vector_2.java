import java.util.*;
public class Vector_2 {
    
        private double x;
        private double y;
    
        // Constructor
        public Vector_2(double x, double y) {
            this.x = x;
            this.y = y;
        }
    
        // Get the length of the vector
        public double getLength() {
            return Math.sqrt(x * x + y * y);
        }
    
        // Get the direction of the vector in radians (-π to π)
        public double getDirection() {
            return Math.atan2(y, x);
        }
    
        // Calculate the dot product with another vector
        public double dot(Vector_2 v) {
            return x * v.x + y * v.y;
        }
    
        // Get the unit vector in the same direction
        public Vector_2 getUnitVector() {
            double length = getLength();
            return new Vector_2(x / length, y / length);
        }
    
        // Print the vector in the specified format
        public void print() {
            System.out.printf("Vector: %.2fi + %.2fj%n", x, y);
        }
    
        // Example usage
        public static void main(String[] args) {
            Vector_2 v1 = new Vector_2(1.0, 2.5);
            Vector_2 v2 = new Vector_2(3.0, -1.5);
    
            // Print vectors
            v1.print();
            v2.print();
    
            // Print vector length and direction
            System.out.println("v: lenght = " + (v1.getLength()));
            System.out.println("direction = " + v1.getDirection());
    
            // Print dot product
            System.out.println("u.v = " + v1.dot(v2));
    
            // Print unit vector
            Vector_2 unitV1 = v1.getUnitVector();
            unitV1.print();
        }
    }
    

