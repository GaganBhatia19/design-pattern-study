package com.company.Decorator;

public class DecoratorMain {
    public static void run() {
        Coffee simpleCoffee = new BaseCoffee();
        System.out.println(simpleCoffee.getDescription() + " : " + simpleCoffee.getPrice());

        Coffee milkCoffee = new MilkCoffee(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + " : " + milkCoffee.getPrice());

        //modify object at runtime
        Coffee extraStrongSugarCoffee = new StrongCoffee(new SugarCoffee(simpleCoffee));
        System.out.println(extraStrongSugarCoffee.getDescription() + " : " + extraStrongSugarCoffee.getPrice());

        Coffee extraStrongSugarMilkCoffee = new StrongCoffee(new StrongCoffee(new SugarCoffee(milkCoffee)));
        System.out.println(extraStrongSugarMilkCoffee.getDescription() + " : " + extraStrongSugarMilkCoffee.getPrice());
    }
}
