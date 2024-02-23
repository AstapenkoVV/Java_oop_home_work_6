package ru.gb.oop.dz_task_6.model;

import java.util.Scanner;

public class Calculator {
    private String enterData;

    public String enterData(){
        Scanner scanner = new Scanner(System.in);
        enterData = scanner.nextLine();
        return enterData;
    }
}
