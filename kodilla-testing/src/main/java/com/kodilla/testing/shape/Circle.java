package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private String shapeName = "circle";
    private double field;

    public Circle(double radius) {
        this.field = 3.14 * radius * radius;
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
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
                Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }
}
