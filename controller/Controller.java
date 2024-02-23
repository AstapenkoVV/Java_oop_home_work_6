package ru.gb.oop.dz_task_6.controller;

import ru.gb.oop.dz_task_6.model.Calculator;
import ru.gb.oop.dz_task_6.service.DataArithmetic;
import ru.gb.oop.dz_task_6.service.DataConversion;
import ru.gb.oop.dz_task_6.view.ViewArithmetic;
import ru.gb.oop.dz_task_6.view.ViewConversoin;

public class Controller {
    private DataArithmetic dataArithmetic;
    private DataConversion dataConversion;
    private ViewArithmetic viewArithmetic;
    private ViewConversoin viewConversoin;
    private Calculator calculator;

    public Controller() {
        dataArithmetic = new DataArithmetic();
        dataConversion = new DataConversion();
        viewArithmetic = new ViewArithmetic();
        viewConversoin = new ViewConversoin();
        calculator = new Calculator();
    }

    public void start() {
        System.out.println("Калькулятор умеет:" +
                "\n'+' сложение" +
                "\n'-' вычитание" +
                "\n'*' умножение" +
                "\n'/' деление" +
                "\n'2' перевод числа в 2ю" +
                "\n'10' перевод числа в 10ю");
        System.out.print("Введите число: ");
        String x = calculator.enterData();
        Double a = Double.parseDouble(x);
        System.out.print("Введите действие: ");
        switch (calculator.enterData()) {
            case ("+"): {
                System.out.print("Введите число: ");
                Double b = Double.parseDouble(calculator.enterData());
                viewArithmetic.printArithmetic(dataArithmetic.sum(a, b));
                break;
            }
            case ("-"): {
                System.out.print("Введите число: ");
                Double b = Double.parseDouble(calculator.enterData());
                viewArithmetic.printArithmetic(dataArithmetic.subtraction(a, b));
                break;
            }
            case ("*"): {
                System.out.print("Введите число: ");
                Double b = Double.parseDouble(calculator.enterData());
                viewArithmetic.printArithmetic(dataArithmetic.multiply(a, b));
                break;
            }
            case ("/"): {
                System.out.print("Введите число: ");
                Double b = Double.parseDouble(calculator.enterData());
                viewArithmetic.printArithmetic(dataArithmetic.division(a, b));
                break;
            }
            case ("2"): {
                viewConversoin.printConversoin(dataConversion.conversionToBin(x));
                break;
            }
            case ("10"): {
                viewConversoin.printConversoin(dataConversion.conversionToDecimal(x));
                break;
            }
            default:
                System.out.println("Вы ввели недопустимое значение!");
        }
    }
}
