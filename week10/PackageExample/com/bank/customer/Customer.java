package com.bank.customer;

import com.bank.account.Account;
import java.util.ArrayList;
import java.util.List;

/**
 * A `com.bank.customer` csomag ügyfelek adatait kezeli.
 * 
 * Az ügyfél tartalmazhat több számlát is, amelyeket a listában tárolunk.
 * Ez az osztály felelős az ügyfélhez kapcsolódó alapvető adatok tárolásáért 
 * és az ügyfél számláinak kezeléséért.
 */
public class Customer {
    private String name;               // Az ügyfél neve
    private List<Account> accounts;    // Az ügyfél számláinak listája

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    /**
     * Új számla hozzáadása az ügyfélhez.
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }
}
