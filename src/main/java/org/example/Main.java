package org.example;

import org.example.HW1.HW1;
import org.example.HW2.*;

public class Main {
    public static void main(String[] args) {
        //для HW2
        //class Book
        Book testBook = new Book("Test Author", "Test Title", 250.00);
        testBook.setAuthor("New Test Author");
        testBook.setPrice(299.99);

        System.out.println(testBook.getAuthor() + " " + testBook.getTitle() + " " + testBook.getPrice());

        //class Person
        Person person1 = new Person("Jack", 36);
        person1.printInfo();

        Person person2 = new Person();
        person2.setName("Lily");
        person2.setAge(23);
        person2.setGender("woman");

        //class Car
        Car car = new Car();
        car.setPrice(2500.0);
        car.printCarInfo();

        //class Product
        Product product = new Product("Test Product", "For testing", 1, 10);
        product.setQuantity(10);
        product.printProductInfo();

        //class Student
        Student[] students = new Student[3];
        students[0] = new Student("Bob", 12, 99.1);
        students[1] = new Student("Anna", 16, 89.5);
        students[2] = new Student("Peter", 96, 45.5);

        for(int i = 0; i < students.length; i++){
            students[i].printStudentDetails();
        }

        //class Currency
        Currency currencyRUB = new Currency("RUB", 100.0);
        currencyRUB.printCurrencyInfo();
        System.out.println("RUB -> USD: " + currencyRUB.convertToUSD(10));

        //class Phone
        Phone phone = new Phone("Test Brand", "Test model", 2000.50);
        phone.applyDiscount(50);
        phone.printPhoneDetails();

        //class Employee
        Employee employee1 = new Employee("Mary", "Developer", 3000.00);
        employee1.increaseSalary(5);
        employee1.printEmployeeInfo();

        Employee employee2 = new Employee("Emily", "HR", 1500.00);
        employee2.increaseSalary(10);
        employee2.printEmployeeInfo();

        //class Triangle
        Triangle triangle = new Triangle(10.0, 20.0, 20.0);
        triangle.printTriangleInfo();

        //class Player
        Player player = new Player("Madovator", 99, 2578);
        player.increaseLevel();
        player.addScore(250);
        player.printPlayerInfo();

        //class Rectangle
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.printRectangleInfo();

        //class Customer
        Customer customer = new Customer("Test customer", "test@mail.com");
        customer.addPurchase("Apple");
        customer.addPurchase("Milk");
        customer.addPurchase("Bread");
        customer.printPurchaseHistory();

        //class Company
        Company company = new Company("Test company", 1000, 250000.0);
        company.printCompanyInfo();

        //class Circle
        Circle circle = new Circle(100);
        circle.printCircleInfo();


        /**
        //для HW1
        HW1 hw1 = new HW1();

        //тест для метода checkDivisionOn5and7
        System.out.println("35 делится на 5 и 7 " + hw1.checkDivisionOn5and7(35));
        System.out.println("5 делится на 5 и 7 "  + hw1.checkDivisionOn5and7(5));
        System.out.println("7 делится на 5 и 7 "  + hw1.checkDivisionOn5and7(7));

        //тест для метода checkIntervalFrom10To20
        System.out.println("10 входит в интервал от 10 до 20 " + hw1.checkIntervalFrom10To20(10));
        System.out.println("20 входит в интервал от 10 до 20 " + hw1.checkIntervalFrom10To20(20));
        System.out.println("9 входит в интервал от 10 до 20 " + hw1.checkIntervalFrom10To20(9));
        System.out.println("21 входит в интервал от 10 до 20 " + hw1.checkIntervalFrom10To20(22));

        //тест для метода checkIfOneNumberIsTheSquareOfAnother
        System.out.println("4 это квадрат 16 " + hw1.checkIfOneNumberIsTheSquareOfAnother(4, 16));
        System.out.println("11 это квадрат 121 " + hw1.checkIfOneNumberIsTheSquareOfAnother(121, 11));
        System.out.println("5 это квадрат 50 " + hw1.checkIfOneNumberIsTheSquareOfAnother(5, 50));
        System.out.println("7 это квадрат 144 " + hw1.checkIfOneNumberIsTheSquareOfAnother(70, 7));

        //тест для метода checkIfNumberEndsWithFive
        System.out.println("последняя цифра 5 - это 5 " + hw1.checkIfNumberEndsWithFive(5));
        System.out.println("последняя цифра 115 - это 5 " + hw1.checkIfNumberEndsWithFive(115));
        System.out.println("последняя цифра 10 - это 5 " + hw1.checkIfNumberEndsWithFive(10));
        System.out.println("последняя цифра 57 - это 5 " + hw1.checkIfNumberEndsWithFive(57));

        //тест для метода checkIfSumISEven
        System.out.println("сумма 22 и 40 четная " + hw1.checkIfSumISEven(22, 40));
        System.out.println("сумма 21 и 40 четная " + hw1.checkIfSumISEven(21, 40));

        //тест для метода checkIfModuloIsEqual
        System.out.println("6 и -6 равны по модулю " + hw1.checkIfModuloIsEqual(6, -6));
        System.out.println("-7 и 7 равны по модулю " + hw1.checkIfModuloIsEqual(-7, 7));
        System.out.println("-8 и -8 равны по модулю " + hw1.checkIfModuloIsEqual(-8, -8));
        System.out.println("-9 и 3 равны по модулю " + hw1.checkIfModuloIsEqual(-9, 3));

        //тест для метода checkNumberSign
        System.out.println("Знак числа для -1 " + hw1.checkNumberSign(-1));
        System.out.println("Знак числа для 0 " + hw1.checkNumberSign(0));
        System.out.println("Знак числа для 1 " + hw1.checkNumberSign(1));

        //тест для метода checkDivisionOn2and3
        System.out.println("6 делится на 2 и на 3 " + hw1.checkDivisionOn2and3(6));
        System.out.println("2 делится на 2 и на 3 " + hw1.checkDivisionOn2and3(2));
        System.out.println("3 делится на 2 и на 3 " + hw1.checkDivisionOn2and3(3));

        //тест для метода checkIfSumIsEven
        System.out.println("сумма 22 и 40 " + hw1.checkIfSumIsEven(22, 40));
        System.out.println("сумма 21 и 40 " + hw1.checkIfSumIsEven(21, 40));

        //тест для метода checkDivisionOn4and6
        System.out.println("24 делится на 4 и на 6 " + hw1.checkDivisionOn4and6(24));
        System.out.println("4 делится на 4 и на 6  " + hw1.checkDivisionOn4and6(4));
        System.out.println("6 делится на 4 и на 6  " + hw1.checkDivisionOn4and6(6));

        //тест для метода checkIfSumIsEvenAndDivisibleby10
        System.out.println("сумма 50 и 50 четная и делится на 10 " + hw1.checkIfSumIsEvenAndDivisibleby10(50, 50));
        System.out.println("сумма 40 и 22 четная и делится на 10 " + hw1.checkIfSumIsEvenAndDivisibleby10(40, 22));
        System.out.println("сумма 4 и 7 четная и делится на 10 " + hw1.checkIfSumIsEvenAndDivisibleby10(4, 7));

        //тест для метода findMaxNumber
        System.out.println("Большее число из 11, 12, 13 - это " + hw1.findMaxNumber(11, 12, 13));
        System.out.println("Большее число из 11, 22, 13 - это " + hw1.findMaxNumber(11, 22, 13));
        System.out.println("Большее число из 21, 12, 13 - это " + hw1.findMaxNumber(21, 12, 13));

        //тест для метода checkIfNumberIsPalindrom
        System.out.println("Число 12321 - это палиндром " + hw1.checkIfNumberIsPalindrom(12321));
        System.out.println("Число 2332 - это палиндром " + hw1.checkIfNumberIsPalindrom(2332));
        System.out.println("Число 1234 - это палиндром " + hw1.checkIfNumberIsPalindrom(1234));

        //тест для метода checkIfDevidedByThree
        System.out.println("9 и 12 кратны трем - вернуть их сумму " + hw1.checkIfDevidedByThree(9, 12));
        System.out.println("1 и 2 не кратны трем - вернуть null " + hw1.checkIfDevidedByThree(1, 2));
        System.out.println("5 и 15 одно из чисел кратно трем - вернуть квадрат второго числа " + hw1.checkIfDevidedByThree(5, 15));
        System.out.println("6 и 11 одно из чисел кратно трем - вернуть квадрат второго числа " + hw1.checkIfDevidedByThree(6, 11));

        //тест для метода checkAgeCategory
        System.out.println("Вывести категорию для возраста 12 " + hw1.checkAgeCategory(12));
        System.out.println("Вывести категорию для возраста 13 " + hw1.checkAgeCategory(13));
        System.out.println("Вывести категорию для возраста 17 " + hw1.checkAgeCategory(17));
        System.out.println("Вывести категорию для возраста 18 " + hw1.checkAgeCategory(18));
        System.out.println("Вывести категорию для возраста 64 " + hw1.checkAgeCategory(64));
        System.out.println("Вывести категорию для возраста 65 " + hw1.checkAgeCategory(65));
        System.out.println("Вывести категорию для возраста 0 " + hw1.checkAgeCategory(0));

        //тест для метода checkIfDivisionReminderIs2
        System.out.println("Проверить что 8 делится на 6 с остатком 2 " + hw1.checkIfDivisionReminderIs2(8, 6));
        System.out.println("Проверить что 9 делится на 6 с остатком 2 " + hw1.checkIfDivisionReminderIs2(9, 6));
         **/
    }
}
