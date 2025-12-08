// ConstructorDemo.java
public class ConstructorDemo {

    public static class User {
        private String id;
        private String name;
        private String email;

        // No-arg constructor
        public User() {
            this("unknown", "Guest", "guest@example.com");
        }

        // Primary constructor
        public User(String id, String name, String email) {
            this.id = (id == null || id.isBlank()) ? "unknown" : id;
            this.name = (name == null) ? "Guest" : name;
            this.email = (email == null) ? "guest@example.com" : email;
        }

        // Constructor chaining example
        public User(String id, String name) {
            this(id, name, name.toLowerCase().replaceAll("\\s+","") + "@example.com");
        }

        @Override
        public String toString() {
            return "User{id='" + id + "', name='" + name + "', email='" + email + "'}";
        }
    }

    public static void main(String[] args) {
        User u1 = new User(); // default
        User u2 = new User("U101", "Parth Lahane");
        User u3 = new User("U102", "Trupti Sharma", "trupti@example.com");

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}
