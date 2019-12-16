package com.kodilla.testing.shapes;

public class Triangle implements Shape {
    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public String getField() {
        return "P = 1/2*a*h";
    }
}
