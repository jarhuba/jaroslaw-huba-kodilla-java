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

        //Then
        Assert.assertEquals("do zrobienia", toDoList);
        Assert.assertEquals("właśnie robię", inProgressList);
        Assert.assertEquals("zrobione", doneList);
    }
}
