package basic.c08_oop.inheritanceExer;

public class AccountExer {
    
    public static class Account {
        private double balance;
        
        public Account(double initialBalance) {
            this.balance = initialBalance;
        }
        
        public double getBalance() {
            return balance;
        }
        
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        }
        
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds!");
            }
        }
    }
    
    public static class SavingsAccount extends Account {
        private double interestRate;
        
        public SavingsAccount(double initialBalance, double interestRate) {
            super(initialBalance);
            this.interestRate = interestRate;
        }
        
        public void addInterest() {
            double interest = getBalance() * interestRate / 100;
            deposit(interest);
            System.out.println("Interest added: $" + String.format("%.2f", interest));
        }
    }
}
