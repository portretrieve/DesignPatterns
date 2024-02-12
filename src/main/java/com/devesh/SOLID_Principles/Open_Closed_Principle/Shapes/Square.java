package com.devesh.SOLID_Principles.Open_Closed_Principle.Shapes;

public class Square implements Shape{

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Square(int length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println(length*length);
    }
}