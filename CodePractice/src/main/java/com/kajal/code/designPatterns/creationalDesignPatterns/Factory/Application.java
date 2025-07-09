package com.kajal.code.designPatterns.creationalDesignPatterns.Factory;

interface Shape {
    void draw();
}

public class Application {
    public static void main(String[] args) {
    Shape shape1 = ShapeFactory.getShape("Circle");
    shape1.draw();

    }
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equals("Circle"))
            return new Circle();

        return null;
    }
}
