package com.kodilla.testing.shapes;

public class Circle implements Shape{

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public String getField() {
        return "P = Pi*r^2";
    }
}
