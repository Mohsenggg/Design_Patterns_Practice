package org.example.patterns.structural.decorator.coffee;

import org.example.patterns.structural.decorator.coffee.core.Coffee;
import org.example.patterns.structural.decorator.coffee.core.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        double newCost = decoratedCoffee.getCost() + 5;
        System.out.println("Add Milk will cost 5$ total is = " + newCost);
        return newCost;
    }

    @Override
    public String getDescription() {
        String newDescription = decoratedCoffee.getDescription() + ", Milk";
        return newDescription;
    }
}
