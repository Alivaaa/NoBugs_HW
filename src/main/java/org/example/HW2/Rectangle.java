package org.example.HW2;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return this.height * this.width;
    }
    public double calculatePerimeter() {
        return (this.height + this.width) * 2;
    }

    public void printRectangleInfo() {
        System.out.println("Прямоугольник: Ширина = " + this.width + ", Высота = " + this.height + ", Площадь = "
                + calculateArea() + ", Периметр = " + calculatePerimeter());
    }
}
