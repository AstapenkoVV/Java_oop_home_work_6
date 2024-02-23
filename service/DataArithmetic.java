package ru.gb.oop.dz_task_6.service;

public class DataArithmetic implements ServiceArithmetic {

    @Override
    public Double sum(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double subtraction(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multiply(Double a, Double b) {

        return a * b;
    }

    @Override
    public Double division(Double a, Double b) {
        if (b == 0) {
            System.out.println("Деление на ноль невозможно!");
            return Double.NaN;
        }
        return a / b;
    }
}
