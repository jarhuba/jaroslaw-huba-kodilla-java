package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addTaskToDoList("do zrobienia");
        board.addTaskInProgressList("właśnie robię");
        board.addTaskDoneList("zrobione");

        //When
        String toDoList = board.getToDoList().getTasks().get(0);
        String inProgressList = board.getInProgressList().getTasks().get(0);
        String doneList = board.getDoneList().getTasks().get(0);
        int toDoListSize = board.getToDoList().getTasks().size();
        int inProgressListSize = board.getInProgressList().getTasks().size();
        int doneListSize = board.getDoneList().getTasks().size();

        //Then
        Assert.assertEquals("do zrobienia", toDoList);
        Assert.assertEquals("właśnie robię", inProgressList);
        Assert.assertEquals("zrobione", doneList);
        Assert.assertEquals(1, toDoListSize);
        Assert.assertEquals(1, inProgressListSize);
        Assert.assertEquals(1, doneListSize);
    }

    @Test
    public void testTaskRemove() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addTaskToDoList("do zrobienia");
        board.addTaskToDoList("do zrobienia2");
        board.addTaskInProgressList("właśnie robię");
        board.addTaskInProgressList("właśnie robię2");
        board.addTaskDoneList("zrobione");

        board.removeTaskToDoList("do zrobienia");
        board.removeTaskInProgressList("właśnie robię");
        board.removeTaskDoneList("zrobione");

        //When
        int toDoListSize = board.getToDoList().getTasks().size();
        int inProgressListSize = board.getInProgressList().getTasks().size();
        int doneListSize = board.getDoneList().getTasks().size();

        //Then
        Assert.assertEquals(1, toDoListSize);
        Assert.assertEquals(1, inProgressListSize);
        Assert.assertEquals(0, doneListSize);
    }

    @Test
    public void testTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList taskList = context.getBean(TaskList.class);
        taskList.getTasks().add("test task");

        //When
        int taskListSize = taskList.getTasks().size();
        String taskListEntry = taskList.getTasks().get(0);

        //Then
        Assert.assertEquals(1, taskListSize);
        Assert.assertEquals("test task", taskListEntry);
    }
}
