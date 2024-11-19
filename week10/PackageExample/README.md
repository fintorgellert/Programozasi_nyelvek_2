# **Java Package használat: Banki példa**

---

## **Mi az a Package?**

Egy **package** a Java nyelvben egy **logikai tároló**, amely osztályokat és interfészeket csoportosít.  
Segít a kód:
- **Szervezésében**,
- **Átláthatóságában**,
- **Újrafelhasználhatóságában**,
- **Névütközések elkerülésében**.

A package használata olyan, mint könyvtárakat létrehozni egy fájlrendszerben: logikusan elkülönítjük a funkciókat és a kódrészeket.

---

## **Miért hasznos?**

### **1. Modularitás**
A csomagok segítségével a kód modulokra bontható, amelyek egy-egy specifikus feladatot látnak el. Például egy banki rendszerben külön modul kezelheti:
- **Ügyfelek adatait (`customer`)**
- **Számlákat (`account`)**
- **Tranzakciókat (`transaction`)**

### **2. Karbantarthatóság**
A csomagok lehetővé teszik, hogy a rendszer különböző részei egymástól függetlenül fejleszthetők és javíthatók legyenek.

### **3. Névütközések elkerülése**
Képzelje el, hogy két fejlesztő ugyanazt az osztálynevet használja: pl. `Account`. A package neve (pl. `com.bank.account`) megkülönbözteti őket, így elkerülhető a névütközés.

### **4. Kód újrafelhasználhatóság**
A jól strukturált package-ek és osztályok újrahasználhatók más projektekben is.

---

## **Banki példa: Projekt felépítése**

### **Mappa struktúra**
```bash
src/
└── com/
    └── bank/
        ├── account/          # Számlák kezelése
        │   ├── Account.java
        │   ├── SavingsAccount.java
        │   └── CheckingAccount.java
        ├── customer/         # Ügyfélkezelés
        │   └── Customer.java
        ├── transaction/      # Tranzakciók
        │   └── Transaction.java
        └── main/             # Fő futtatási pont
            └── Main.java
```

### **Csomagok és feladataik**

1. **`com.bank.account`**
   - Az ügyfél számláit kezeli.
   - Az egyes számlatípusok (pl. megtakarítási számla, folyószámla) osztályai itt találhatók.
   - Példa osztályok:
     - `Account`: Számlák alapvető funkcionalitása.
     - `SavingsAccount`: Megtakarítási számla logikája.
     - `CheckingAccount`: Folyószámla, hitelkeret támogatással.

2. **`com.bank.customer`**
   - Az ügyfelek adatait és azok számláit tartalmazza.
   - Példa osztály:
     - `Customer`: Egy ügyfél adatai (pl. név, számlák listája).

3. **`com.bank.transaction`**
   - A tranzakciók kezeléséért felel.
   - Példa osztály:
     - `Transaction`: Tranzakciós logika (pl. pénz átutalása két számla között).

4. **`com.bank.main`**
   - A program futtatási belépési pontja.
   - Tartalmazza a `Main` osztályt, amely összeállítja és futtatja a teljes rendszert.

---

## **Hogyan működik?**

### **Main osztály (Belépési pont)**

A `com.bank.main.Main` osztály felel a program indításáért. Az alábbi példában:
- Létrehozunk egy ügyfelet.
- Hozzárendelünk számlákat.
- Végrehajtunk egy tranzakciót, majd kiírjuk az eredményt.

#### **Példa kód:**
```java
package com.bank.main;

import com.bank.account.CheckingAccount;
import com.bank.account.SavingsAccount;
import com.bank.customer.Customer;
import com.bank.transaction.Transaction;

public class Main {
    public static void main(String[] args) {
        // Ügyfél létrehozása
        Customer customer = new Customer("Jane Doe");

        // Számlák létrehozása
        SavingsAccount savings = new SavingsAccount("SA123", 3000.0);
        CheckingAccount checking = new CheckingAccount("CA456", 1500.0, 500.0);

        // Számlák hozzáadása az ügyfélhez
        customer.addAccount(savings);
        customer.addAccount(checking);

        // Tranzakció: Pénz átutalása
        Transaction.transfer(savings, checking, 500.0);

        // Eredmények kiírása
        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}
```

## Fontos megjegyzések

#### 1. Csomagnevek konvenciója:
- Általában a szervezet domain nevét használjuk fordított sorrendben (pl. `com.bank`).
- Ez biztosítja az egyediséget, és segít elkerülni az ütközéseket nagyobb projektekben.

#### 2. Független modulok:
- Ha egy package logikája megváltozik, például új tranzakciótípusokat vezetünk be, csak a `transaction` package-t kell módosítanunk.

#### 3. Importálás:
- Más package-ek osztályait az `import` kulcsszóval érhetjük el. Ez biztosítja, hogy a megfelelő osztályokat használjuk a programban.

## Előnyök összegzése

- **Kód olvashatóság**: Egyértelmű, hogy melyik package mely funkciókat tartalmaz.
- **Modularitás**: A projekt könnyen bővíthető anélkül, hogy összekevernénk a különböző funkciókat.
- **Újrafelhasználhatóság**: A `transaction` vagy `account` package önállóan más projektekben is használható.

