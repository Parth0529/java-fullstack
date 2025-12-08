// InheritanceDemo.java
import java.util.ArrayList;
import java.util.List;

public class InheritanceDemo {

    public static abstract class Employee {
        protected String id;
        protected String name;

        public Employee(String id, String name) {
            this.id = id;
            this.name = name;
        }

        // Every employee must implement salary calculation
        public abstract double calculateMonthlyPay();

        public String getDisplayName() { return name + " (" + id + ")"; }
    }

    public static class Developer extends Employee {
        private double monthlySalary;

        public Developer(String id, String name, double monthlySalary) {
            super(id, name);
            this.monthlySalary = monthlySalary;
        }

        @Override
        public double calculateMonthlyPay() {
            return monthlySalary;
        }
    }

    public static class Manager extends Employee {
        private double baseSalary;
        private double teamBonus;

        public Manager(String id, String name, double baseSalary, double teamBonus) {
            super(id, name);
            this.baseSalary = baseSalary;
            this.teamBonus = teamBonus;
        }

        @Override
        public double calculateMonthlyPay() {
            return baseSalary + teamBonus;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Developer("D100", "Rohit", 60000));
        employees.add(new Manager("M200", "Sneha", 90000, 15000));

        for (Employee e : employees) {
            System.out.printf("%s -> Pay: %.2f%n", e.getDisplayName(), e.calculateMonthlyPay());
        }
    }
}
