// EncapsulationDemo.java
public class EncapsulationDemo {

    public static class BankAccount {
        private final String accountId;
        private double balance;

        public BankAccount(String accountId, double initialBalance) {
            if (accountId == null || accountId.isBlank()) throw new IllegalArgumentException("accountId required");
            if (initialBalance < 0) throw new IllegalArgumentException("initialBalance cannot be negative");
            this.accountId = accountId;
            this.balance = initialBalance;
        }

        public String getAccountId() { return accountId; }

        // synchronized to show thread-safety pattern for shared state
        public synchronized void deposit(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("deposit amount must be positive");
            balance += amount;
        }

        public synchronized void withdraw(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("withdraw amount must be positive");
            if (amount > balance) throw new IllegalStateException("insufficient funds");
            balance -= amount;
        }

        public synchronized double getBalance() { return balance; }

        @Override
        public String toString() {
            return String.format("BankAccount{id=%s, balance=%.2f}", accountId, balance);
        }
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount("ACC-001", 1000.0);
        a.deposit(500.0);
        try {
            a.withdraw(2000.0);
        } catch (Exception ex) {
            System.out.println("Expected error: " + ex.getMessage());
        }
        a.withdraw(300.0);
        System.out.println(a);
    }
}
