package com.bank.account;

/**
 * A `SavingsAccount` (megtakarítási számla) egy konkrét bankszámla típus,
 * amely meghatározza, hogy mekkora összeget lehet egyszerre kivenni.
 */
public class SavingsAccount extends Account {
    private static final double WITHDRAWAL_LIMIT = 1000.0; // Maximális kivehető összeg

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // Hívja az Account osztály konstruktorát
    }

    @Override
    public void withdraw(double amount) {
        // Ellenőrzi, hogy az összeg nem haladja meg a korlátot
        if (amount > WITHDRAWAL_LIMIT) {
            throw new IllegalArgumentException("Withdrawal exceeds limit!");
        }

        // Ellenőrzi, hogy van-e elég pénz az egyenlegen
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds!");
        }
        
        balance -= amount;              // Az összeg levonása az egyenlegből
    }
}
