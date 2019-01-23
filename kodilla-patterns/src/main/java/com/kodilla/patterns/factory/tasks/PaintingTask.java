package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String whatToPaint;
    private String color;
    private boolean doneTask = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Maluję " + whatToPaint + " na kolor " + color + ".");
        doneTask = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return doneTask;
    }
}
