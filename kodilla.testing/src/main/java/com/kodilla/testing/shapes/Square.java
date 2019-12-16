package com.kodilla.testing.shapes;

public class Square implements Shape{

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public String getField() {
        return "P = a^2";
    }
}
