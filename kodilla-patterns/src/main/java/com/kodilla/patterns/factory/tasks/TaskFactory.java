package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task doTask(String task) {
        switch (task) {
            case SHOPPING:
                return new ShoppingTask("Zakupy", "kredki", 6.0);
            case PAINTING:
                return new PaintingTask("Malowanie ścian", "biały", "ściany");
            case DRIVING:
                return new DrivingTask("Wakacyjna jazda", "Zakopane", "pociąg");
            default:
                return null;
        }
    }
}
