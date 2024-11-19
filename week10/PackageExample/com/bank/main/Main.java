package com.bank.main;

import com.bank.account.CheckingAccount;
import com.bank.account.SavingsAccount;
import com.bank.customer.Customer;
import com.bank.transaction.Transaction;

/**
 * A Main osztály a program belépési pontja.
 * Ez a `com.bank.main` csomagban helyezkedik el, hogy elkülönítsük a projekt többi részétől.
 */
public class Main {
    public static void main(String[] args) {
        // Új ügyfél létrehozása
        Customer customer = new Customer("John Doe");

        // Számlák hozzáadása az ügyfélhez
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.0);
        CheckingAccount checking = new CheckingAccount("CA12345", 2000.0, 500.0);

        customer.addAccount(savings);
        customer.addAccount(checking);

        // Tranzakció végrehajtása
        Transaction.transfer(savings, checking, 1000.0);

        // Eredmények kiírása
        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}
