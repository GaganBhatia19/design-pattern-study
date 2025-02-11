package com.company.Decorator;

// why keep decorator classes abstract?
// to keep them protected from direct instantiation as decorators itself doens't represent true behavior, behavior depends on it's subclasses
public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee; // keep it as protected because we want our subclasses to refer this

    CoffeeDecorator(Coffee coffee) {
        decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public int getPrice() {
        return decoratedCoffee.getPrice();
    }
}

class MilkCoffee extends CoffeeDecorator{

    MilkCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Milk";
    }

    @Override
    public int getPrice() {
        return decoratedCoffee.getPrice() + 10;
    }
}
class SugarCoffee extends CoffeeDecorator{

    SugarCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Sugar";
    }

    @Override
    public int getPrice() {
        return decoratedCoffee.getPrice() + 5;
    }
}
class StrongCoffee extends CoffeeDecorator{

    StrongCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Strong";
    }

    @Override
    public int getPrice() {
        return decoratedCoffee.getPrice() + 7;
    }
}
