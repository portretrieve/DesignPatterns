package com.devesh.SOLID_Principles.Open_Closed_Principle.Shapes;

public class Circle implements Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(3.14 * radius * radius);
    }
}
