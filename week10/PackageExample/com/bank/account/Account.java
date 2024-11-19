package com.bank.account;

/**
 * A `com.bank.account` csomag tartalmazza a bankszámlák kezeléséhez szükséges osztályokat.
 * 
 * Ez az osztály az alapvető számla adatait és viselkedését definiálja, például az egyenleg lekérdezését
 * és a befizetések kezelését. Az `Account` absztrakt osztály, tehát konkrét típusokat a 
 * leszármazott osztályok (pl. SavingsAccount, CheckingAccount) hoznak létre.
 */
public abstract class Account {
    protected String accountNumber; // A számla azonosítója
    protected double balance;       // Az aktuális egyenleg

    public Account(String accountNumber, double balance) {
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
        balance += amount;          // Összeg hozzáadása az egyenleghez
    }

    /**
     * A kifizetés logikáját a leszármazott osztályoknak kell megvalósítani.
     */
    public abstract void withdraw(double amount);
}
