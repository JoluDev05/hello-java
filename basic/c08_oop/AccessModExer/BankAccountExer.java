package basic.c08_oop.AccessModExer;

public class BankAccountExer {
    private String accountNumber;
    private double balance;

    public BankAccountExer(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depositado: " + amount);
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Retirado: " + amount);
        } else {
            System.out.println("Cantidad inválida para retiro o saldo insuficiente.");
        }
    }
}
