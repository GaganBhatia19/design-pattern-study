package com.company.Prototype;

public class Circle extends Shape{
    private float radius;
    Circle() {}

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(String color, short borderThickness, float radius) {
        super(color, borderThickness);
        this.radius = radius;
    }

    public Circle(Shape source, float radius) {
        super(source);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String toString() {
        return this.getColor() + " " + this.getBorderThickness() + " " + this.getRadius();
    }
}
