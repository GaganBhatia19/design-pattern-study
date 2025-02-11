package com.company.Decorator;

// a class that is  already using it...

public class BaseCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "simple coffee";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
