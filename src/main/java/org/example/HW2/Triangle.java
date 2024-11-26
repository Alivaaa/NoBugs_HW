package org.example.HW2;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return  a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calculatePerimeter() {
        return this.a + this.b + this.c;
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2.0;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public void printTriangleInfo() {
        System.out.println("Сторона a: " + this.a + ", " + "Сторона b: " + this.b + ", " + "Сторона c: " + this.c);
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
    }
}
