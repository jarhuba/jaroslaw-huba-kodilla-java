package com.kodilla.spring.portfolio;

public class Board {

    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToDoList(String task) {
        toDoList.addTask(task);
    }

    public void addTaskInProgressList(String task) {
        inProgressList.addTask(task);
    }

    public void addTaskDoneList(String task) {
        doneList.addTask(task);
    }

    public void removeTaskToDoList(String task) {
        toDoList.removeTask(task);
    }

    public void removeTaskInProgressList(String task) {
        inProgressList.removeTask(task);
    }

    public void removeTaskDoneList(String task) {
        doneList.removeTask(task);
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
