package org.example.patterns.structural.decorator.coffee;

import org.example.patterns.structural.decorator.coffee.core.Coffee;
import org.example.patterns.structural.decorator.coffee.core.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        Double newCost = decoratedCoffee.getCost() + 3;
        System.out.println("Add Sugar will cost 3$ total cost is = " + newCost);
        return newCost;
    }

    @Override
    public String getDescription() {
        String newDescription = decoratedCoffee.getDescription() + " ,Sugar";
        return newDescription;
    }
}
