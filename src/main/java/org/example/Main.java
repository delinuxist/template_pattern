package org.example;

import org.example.beverage.*;

public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea(MugType.MEDIUM, 24.0);
        tea.prepareBeverage();
        System.out.println("\n");

        Beverage thisWay = new ThisWay(MugType.LARGE, 98.9);
        thisWay.prepareBeverage();
        System.out.println("\n");

        Beverage coffee = new Coffee(MugType.SMALL, 16.4);
        coffee.prepareBeverage();
    }
}