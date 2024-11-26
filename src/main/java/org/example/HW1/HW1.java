package org.example.HW1;

public class HW1 {

    //1. Вывести true, если число делится на 5 и 7 одновременно, иначе false
    public boolean checkDivisionOn5and7(int num) {
        if (num % 5 == 0 && num % 7 == 0 ){
            return true;
        } else {
            return false;
        }
    }

    //2. Вывести true, если число входит в интервал [10,20], иначе false
    public boolean checkIntervalFrom10To20(int num) {
        if (num >= 10 && num <= 20 ){
            return true;
        } else {
            return false;
        }
    }

    //3. Вывести true, если одно из чисел является квадратом другого, иначе false
    public boolean checkIfOneNumberIsTheSquareOfAnother(int num1, int num2) {
        if (num1 * num1 == num2 || num2 * num2 == num1) {
            return true;
        } else {
            return false;
        }
    }

    //4. Вывести true, если последняя цифра числа = 5, иначе false
    public boolean checkIfNumberEndsWithFive(int num) {
        if (num % 10 == 5) {
            return true;
        } else {
            return false;
        }
    }

    //5. Вывести true, если сумма цифр четная, иначе false
    public boolean checkIfSumISEven(int num1, int num2) {
        if (num1 + num2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //6. Вывести true, если числа равны по модулю, иначе false
    public boolean checkIfModuloIsEqual(int num1, int num2) {
        if (num1 == num2  || num1 == -num2) {
            return true;
        } else {
            return false;
        }
    }

    //7. Вернуть Positive, если a > 0, вернуть Negative, если a < 0, вернуть Zero, если a = 0
    public String checkNumberSign(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    //8. Вывести true, если число делится на 2 и на 3, иначе false
    public boolean checkDivisionOn2and3(int num) {
        if (num % 2 == 0 && num % 3 == 0 ){
            return true;
        } else {
            return false;
        }
    }

    //9. Вывести Even, если сумма чисел четная, иначе Odd
    public String checkIfSumIsEven(int num1, int num2) {
        if ((num1 + num2) % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    //10. Вывести true, если число делится на 4 и на 6 одновременно, иначе false
    public boolean checkDivisionOn4and6(int num) {
        if (num % 4 == 0 && num % 6 == 0 ){
            return true;
        } else {
            return false;
        }
    }

    /*
     * 11. Вывести Even and Divisible by 10, если сумма четная и делится на 10,
     * Even but not Divisible by 10, если сумма четная, но не делится на 10,
     * Odd если сумма нечетная
     */
    public String checkIfSumIsEvenAndDivisibleby10(int num1, int num2) {
        int sum = num1 + num2;
        if (sum % 10 == 0) {
            return "Even and Divisible by 10";
        } else if (sum % 2 == 0) {
            return "Even but not Divisible by 10";
        } else {
            return "Odd";
        }
    }

    //12. Вывести максимум их трех чисел
    public int findMaxNumber(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }

    //13. Вывести true, если число палиндром, иначе false
    public boolean checkIfNumberIsPalindrom(int num) {
        char[] charArr = Integer.toString(num).toCharArray();
        boolean isPalindrom = true;

        for(int i = 0; i < charArr.length / 2; i++) {
            if (charArr[i] != charArr[charArr.length - 1 - i]){
                isPalindrom = false;
                break;
            }
        }

        if (isPalindrom){
            return true;
        } else {
            return false;
        }
    }

    /*
     * #14. Два числа, если оба кратны 3, вернуть сумму
     * Если одно из них кратное, вернуть квадрат второго числа
     * Если ни одно не кратно, вернуть null
     */
    public Integer checkIfDevidedByThree(int num1, int num2) {
        if (num1 % 3 == 0 && num2 % 3 == 0) {
            return num1 + num2;
        } else if (num1 % 3 != 0 && num2 % 3 != 0) {
            return null;
        } else {
            return num2 * num2;
        }
    }

    /*
     * #15. Вернуть Child - до 12 лет,
     * вернуть Teenager - от 13 до 17 лет,
     * вернуть Adult - от 18 до 64 лет,
     * вернуть Senior - от 65 и старше
     */
    public String checkAgeCategory(int age) {
        if (age > 0 && age <= 12) {
            return "Child";
        } else if (age >= 13 && age <= 17) {
            return "Teenager";
        } else if (age >= 18 && age <= 64) {
            return "Adult";
        } else if (age >= 65){
            return "Senior";
        } else {
            return "Undefined category";
        }
    }

    //16. Вернуть true, если первое число делится на второе с остатком равным 2, иначе false
    public boolean checkIfDivisionReminderIs2(int num1, int num2) {
        if (num1 % num2 == 2) {
            return true;
        } else {
            return false;
        }
    }
}

