package ru.gb.oop.dz_task_6.service;

import ru.gb.oop.dz_task_6.model.Calculator;

public class DataConversion implements ServiceConversion{

    @Override
    public Integer conversionToBin(String number) {
        Integer num = Integer.parseInt(number);
        StringBuilder result = new StringBuilder();
        int temp = 0;
        while (num >= 1) {
            temp = num % 2;
            result.insert(0, temp);
            num /= 2;
        }
        Integer resultConvert = Integer.parseInt(result.toString());
        return resultConvert;
    }

    @Override
    public Integer conversionToDecimal(String strNumber) {
        int resultConvert = 0;
        int length = strNumber.length();
        for (int i = 0; i < strNumber.length(); i++) {
            char c = strNumber.charAt(i);
            int bit = Character.getNumericValue(c);
            int exponent = length - 1 - i;
            resultConvert += bit * Math.pow(2, exponent);
        }
        return resultConvert;
    }
}
