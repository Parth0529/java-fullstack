// ClassObjectDemo.java
public class ClassObjectDemo {

    // A simple domain/model class used in enterprise code
    public static class Product {
        private final String id;
        private final String name;
        private final double price;

        public Product(String id, String name, double price) {
            if (id == null || id.isBlank()) throw new IllegalArgumentException("id required");
            if (name == null || name.isBlank()) throw new IllegalArgumentException("name required");
            if (price < 0) throw new IllegalArgumentException("price cannot be negative");
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public String getId() { return id; }
        public String getName() { return name; }
        public double getPrice() { return price; }

        @Override
        public String toString() {
            return String.format("Product{id='%s', name='%s', price=%.2f}", id, name, price);
        }
    }

    public static void main(String[] args) {
        Product p = new Product("P1001", "Wireless Mouse", 899.99);
        System.out.println("Created product -> " + p);
        // Example usage: read-only access to fields
        System.out.println("Product name: " + p.getName());
    }
}
