package org.example;

public class Calc {

    public int summ(int a, int b) {
        int result;
        result = a + b;
        System.out.printf("Сумма %d и %d равна %d", a, b, result);
        return result;
    }
    public int diff(int a, int b) {
        int result;
        result = a - b;
        System.out.printf("Разность %d и %d равна %d", a, b, result);
        return result;
    }
}