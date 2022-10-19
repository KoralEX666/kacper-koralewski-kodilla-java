package com.kodilla.testing.shape;

import java.util.*;
import java.lang.*;


public class ShapeCollector implements Shape{
    List<Shape> shapes=new ArrayList<>();
    ShapeCollector shape;
    String name;
    double field;
    int n;

    public ShapeCollector(String name, double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }
    public double getField() {
        return field;
    }



    public boolean addFigure(ShapeCollector shape){
        this.shape = shape;
        if("square".equals(shape.getShapeName())||"triangle".equals(shape.getShapeName())||"circle".equals(shape.getShapeName())) {
            shapes.add(shape);
            return true;
        } else {
            System.out.println("Geometric figure not recognized, only \"square\", \"circle\", \"triangle\" can be used.");
            return false;
        }

    }
    public boolean removeFigure(ShapeCollector shape){
        return shapes.removeIf(n -> (n == shape));
    }
    public Shape getFigure(int n){
        if (n<shapes.size()){
            return shapes.get(n);
        }else{
            System.out.println("NonExisting position in list.");
            return null;
        }

    }
    public String showFigures(){
        String shapeList = "";
        if (shapes.size() != 0) {
            for (Shape testShape : shapes) {
                shapeList += testShape.getShapeName()+", ";
            }
            shapeList=shapeList.substring(0, shapeList.length()-2);
        }
        return shapeList;
    }

}