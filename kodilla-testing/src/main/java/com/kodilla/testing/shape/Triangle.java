package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName = "triangle";
    private double field;

    public Triangle(double side, double height) {
        this.field = 0.5 * side * height;
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getField() {
        return this.field;
    }

}
