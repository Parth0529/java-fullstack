// PolymorphismDemo.java
public class PolymorphismDemo {

    public interface Shape {
        double area();
        String name();
    }

    public static class Circle implements Shape {
        private final double radius;
        public Circle(double radius) { this.radius = radius; }
        @Override public double area() { return Math.PI * radius * radius; }
        @Override public String name() { return "Circle"; }
    }

    public static class Rectangle implements Shape {
        private final double width;
        private final double height;
        public Rectangle(double w, double h) { this.width = w; this.height = h; }
        @Override public double area() { return width * height; }
        @Override public String name() { return "Rectangle"; }
    }

    // Utility class showing method overloading (compile-time polymorphism)
    public static class GeometryUtils {
        public static double area(Shape s) { return s.area(); }
        public static double area(double radius) { return Math.PI * radius * radius; } // overloaded
    }

    public static void main(String[] args) {
        Shape s1 = new Circle(3.0);
        Shape s2 = new Rectangle(4.0, 5.0);

        System.out.printf("%s area = %.2f%n", s1.name(), GeometryUtils.area(s1));
        System.out.printf("%s area = %.2f%n", s2.name(), GeometryUtils.area(s2));
        // overloaded method directly via radius
        System.out.printf("Circle(area using overloaded method) = %.2f%n", GeometryUtils.area(3.0));
    }
}
