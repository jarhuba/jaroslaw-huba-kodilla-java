package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private final static String SHAPE_NAME = "circle";
    private double field;

    public Circle(double radius) {
        this.field = 3.14 * radius * radius;
    }

    @Override
    public String getShapeName() {
        return this.SHAPE_NAME;
    }

    @Override
    public double getField() {
        return this.field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.field, field) == 0 &&
                Objects.equals(SHAPE_NAME, circle.SHAPE_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SHAPE_NAME, field);
    }
}
