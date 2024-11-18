package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
    }
}
