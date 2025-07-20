package org.example.patterns.structural.decorator.coffee;

import org.example.patterns.structural.decorator.coffee.core.Coffee;

public class SimpleCoffee implements Coffee {

    public double getCost() { return 2.0; }
    public String getDescription() { return "Simple coffee"; }

}
