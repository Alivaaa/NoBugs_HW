package org.example.HW2;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<String> purchaseHistory = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addPurchase(String item) {
        this.purchaseHistory.add(item);
    }

    public void printPurchaseHistory() {
        System.out.println("Клиент: " + this.name + " История покупок: " + this.purchaseHistory);
    }
}
