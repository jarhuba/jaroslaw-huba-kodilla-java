package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape result = null;
        if (shapeList.size() >= 0 && n < shapeList.size()) {
            result = shapeList.get(n);
        }
        return result;
    }

    public String showFigures() {
        String toDisplay = "";
        for (int i = 0; i < shapeList.size(); i++) {
            if (i == shapeList.size() - 1) {
                toDisplay += shapeList.get(i).getShapeName();
            } else {
                toDisplay += shapeList.get(i).getShapeName() + " ";
            }
        }
        return toDisplay;
    }
}
