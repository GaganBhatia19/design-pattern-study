package com.company.Prototype;

// suppose Shape is expensive/expensive object and if in future some one has to create some new object example Circle,
// circle is also a Shape and whatever property Shape holds, circle can also have those and we don't need to add again the same properties to Circle class
// so instead of manually adding all properties, devs can keep a clone in Shape and use the other object with some minor tweaks
public abstract class Shape {
    // can be an interface as well
    private String color;
    private short borderThickness;
    Shape() {}

    public Shape(String color, short borderThickness) {
        this.color = color;
        this.borderThickness = borderThickness;
    }

    public Shape(Shape source) {
        this();
        this.color = source.color;
        this.borderThickness = source.borderThickness;
    }

    public abstract Shape clone();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getBorderThickness() {
        return borderThickness;
    }

    public void setBorderThickness(short borderThickness) {
        this.borderThickness = borderThickness;
    }
}
