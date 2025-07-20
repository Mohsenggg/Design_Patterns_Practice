package org.example.patterns.structural.decorator.coffee.core;

import org.example.patterns.structural.decorator.coffee.MilkDecorator;
import org.example.patterns.structural.decorator.coffee.SimpleCoffee;
import org.example.patterns.structural.decorator.coffee.SugarDecorator;

public class Main {

    public static void main(String[] args) {


        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");

        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println(coffeeWithMilk.getCost());
        System.out.println(coffeeWithMilk.getDescription());


        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");

        Coffee coffeeWithSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println(coffeeWithSugar.getCost());
        System.out.println(coffeeWithSugar.getDescription());


    }


}
