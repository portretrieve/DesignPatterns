package com.devesh.SOLID_Principles.Open_Closed_Principle;

import com.devesh.SOLID_Principles.Open_Closed_Principle.Shapes.Circle;
import com.devesh.SOLID_Principles.Open_Closed_Principle.Shapes.Rectangle;
import com.devesh.SOLID_Principles.Open_Closed_Principle.Shapes.Shape;
import com.devesh.SOLID_Principles.Open_Closed_Principle.Shapes.Square;

public class CalculateShapeArea {

    //Without Open-Closed
    //Let's say if we don't have calculatearea method in classes
    //Now every time a new shape is added we will need another if block here
    public static void calculateShapeAreaWithoutOC(Shape shape){
        if (shape.getClass().equals(Rectangle.class)){
            var area = ((Rectangle) shape).getLength() * ((Rectangle) shape).getWidth();
            System.out.println(area);
        }
        if (shape.getClass().equals(Square.class)){
            var area = ((Square) shape).getLength() * ((Square) shape).getLength();
            System.out.println(area);
        }
        if (shape.getClass().equals(Circle.class)){
            var area = ((Circle) shape).getRadius() * ((Circle) shape).getRadius() * 3.14;
            System.out.println(area);
        }
    }

    //With OC Principle. Logic for calculating Area defined in classes
    //If new Shape is added. We don't have to modify anything here
    public static void calculateShapeArea(Shape shape){
        shape.calculateArea();
    }

}
