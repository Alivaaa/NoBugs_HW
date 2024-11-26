package org.example.HW2;

public class Currency {
    private String name;
    private double rateToUSD;

    public Currency(String name, double rateToUSD) {
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public String getName() {
        return name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRateToUSD(double rateToUSD) {
        this.rateToUSD = rateToUSD;
    }

    public double convertToUSD(double amount) {
        return amount * rateToUSD;
    }

    public void printCurrencyInfo() {
        System.out.println("Валюта: " + this.name + ", Курс к USD: " + this.rateToUSD);
    }
}
