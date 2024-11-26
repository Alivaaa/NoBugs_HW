package org.example.HW2;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double calculateArea() {
        return Math.PI * Math.sqrt(radius);
    }

    public void printCircleInfo() {
        System.out.println("Круг: Радиус = " + this.radius + ", Площадь = " + calculateArea() +
                ", Длина окружности = " + calculateCircumference());
    }
}
