package com.kodilla.testing.shapes;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeArrayList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeArrayList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        if(shapeArrayList.contains(shape)){
            shapeArrayList.remove(shape);
            return true;
        }else {
            return false;
        }
    }

    public Shape getFigure(int n){
        if(shapeArrayList.size() >= n){
            return shapeArrayList.get(n);
        }else {
            return null;
        }
    }

    public ArrayList<Shape> showFigures(){
        return shapeArrayList;
    }
}
