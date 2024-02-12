package com.devesh.SOLID_Principles.Open_Closed_Principle;

import com.devesh.SOLID_Principles.Open_Closed_Principle.Shapes.Circle;
import com.devesh.SOLID_Principles.Open_Closed_Principle.Shapes.Rectangle;
import com.devesh.SOLID_Principles.Open_Closed_Principle.Shapes.Square;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 15);
        Square square = new Square(10);
        Circle circle = new Circle(5);

        //Without Open-Closed
        CalculateShapeArea.calculateShapeAreaWithoutOC(rectangle);
        CalculateShapeArea.calculateShapeAreaWithoutOC(square);
        CalculateShapeArea.calculateShapeAreaWithoutOC(circle);

        //With OpenClosed Principle
        CalculateShapeArea.calculateShapeArea(rectangle);
        CalculateShapeArea.calculateShapeArea(square);
        CalculateShapeArea.calculateShapeArea(circle);
    }
}
