package org.example.HW2;

public class Product {
    private String name;
    private String category;
    private int quantity;
    private double pricePerUnit;

    public Product(String name, String category, int quantity, double pricePerUnit) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void printProductInfo() {
        System.out.println("Товар: " + this.name + ", Категория: " + this.category + ", Количество: " + this.quantity + ", Общая стоимость: " + this.quantity * this.pricePerUnit);
    }
}
