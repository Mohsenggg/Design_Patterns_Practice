package org.example.patterns.structural.decorator.coffee.core;

import org.example.patterns.structural.decorator.coffee.core.Coffee;

public  abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee) { this.decoratedCoffee = coffee; }

}
