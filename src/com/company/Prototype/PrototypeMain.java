package com.company.Prototype;

public class PrototypeMain {
    public static void run() {
        Shape shape = new Shape("blue", (short) 2) {
            @Override
            public Shape clone() {
                return null;
            }
        };
        Circle circle1 = new Circle(shape, 2.75f);
        Circle circle2 = (Circle) circle1.clone();

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());

    }
}
