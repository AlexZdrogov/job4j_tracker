package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + minus(d) + divide(d) + multiply(d);
    }

    public static void main(String[] args) {
        int rslSum = sum(10);
        System.out.println(rslSum);
        Calculator calculator = new Calculator();
        int rslMultiply = calculator.multiply(10);
        System.out.println(rslMultiply);
        int rslMinus = minus(10);
        System.out.println(rslMinus);
        int rslDivide = calculator.divide(10);
        System.out.println(rslDivide);
        int rslAllSum = calculator.sumAllOperation(10);
        System.out.println(rslAllSum);
    }
}
