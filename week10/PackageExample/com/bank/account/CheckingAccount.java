package com.bank.account;

/**
 * A `CheckingAccount` (folyószámla) lehetőséget biztosít arra,
 * hogy az egyenleg akár mínuszba is kerülhessen egy adott hitelkeretig.
 */
public class CheckingAccount extends Account {
    private double overdraftLimit; // Hitelkeret

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        // Ellenőrzi, hogy a kifizetés nem haladja meg a hitelkeretet
        if (amount > balance + overdraftLimit) {
            throw new IllegalArgumentException("Overdraft limit exceeded!");
        }
        balance -= amount;          // Az összeg levonása az egyenlegből
    }
}
