package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String firstName;
    private final String lastName;

    public Mentor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void update(StudentTaskQueue studentTaskQueue) {
        System.out.println("Nowe zadanie studenta! \nObecnie student " + studentTaskQueue.getStudentName() + " ma na liscie "
                + studentTaskQueue.getTasks().size() + " zadań");
    }
}
