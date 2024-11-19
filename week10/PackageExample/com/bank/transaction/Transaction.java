package com.bank.transaction;

import com.bank.account.Account;

/**
 * A `com.bank.transaction` csomag a számlák közötti tranzakciókat kezeli.
 */
public class Transaction {
    /**
     * Két számla között utalást végez, az adott összeg áthelyezésével.
     */
    public static void transfer(Account from, Account to, double amount) {
        // Ellenőrzi, hogy van-e elegendő összeg a forrás számlán
        if (from.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient funds for transfer!");
        }
        from.withdraw(amount); // Összeg levonása a forrás számláról
        to.deposit(amount);    // Összeg hozzáadása a célszámlához
    }
}
