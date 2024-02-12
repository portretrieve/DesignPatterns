package com.devesh.SOLID_Principles.Open_Closed_Principle.Shapes;

public class Rectangle implements Shape{

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area: " + length*width);
    }
}
