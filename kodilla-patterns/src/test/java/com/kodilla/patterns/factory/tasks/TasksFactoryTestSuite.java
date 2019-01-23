package com.kodilla.patterns.factory.tasks;

import org.junit.*;

public class TasksFactoryTestSuite {

    private TaskFactory taskFactory;

    @Before
    public void createFactory() {
        taskFactory = new TaskFactory();
    }

    @Test
    public void testShoppingTask() {
        //Given

        //When
        Task shopping = taskFactory.doTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        boolean done = shopping.isTaskExecuted();
        String taskName = shopping.getTaskName();

        //Then
        Assert.assertTrue(done);
        Assert.assertEquals("Zakupy", taskName);
    }

    @Test
    public void testPaintingTask() {
        //Given

        //When
        Task painting = taskFactory.doTask(TaskFactory.PAINTING);
        painting.executeTask();
        boolean done = painting.isTaskExecuted();
        String taskName = painting.getTaskName();

        //Then
        Assert.assertTrue(done);
        Assert.assertEquals("Malowanie ścian", taskName);
    }

    @Test
    public void testDrivingTask() {
        //Given

        //When
        Task driving = taskFactory.doTask(TaskFactory.DRIVING);
        driving.executeTask();
        boolean done = driving.isTaskExecuted();
        String taskName = driving.getTaskName();

        //Then
        Assert.assertTrue(done);
        Assert.assertEquals("Wakacyjna jazda", taskName);
    }
}
