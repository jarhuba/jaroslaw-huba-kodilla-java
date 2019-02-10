package com.kodilla.hibernate.taskList;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList("testlist1", "first test");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        TaskList readedTaskList = taskListDao.findOne(id);
        long taskListEntries = taskListDao.count();
        Assert.assertEquals(id, readedTaskList.getId());
        Assert.assertEquals(1, taskListEntries);

        //CleanUp
        taskListDao.delete(id);
    }

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("testlist2", "second test");

        //Then
        taskListDao.save(taskList);

        //When
        List<TaskList> readedTaskList = taskListDao.findByListName("testlist2");
        int id = readedTaskList.get(0).getId();
        Assert.assertEquals(1, readedTaskList.size());

        //CleanUp
        taskListDao.delete(id);
    }
}
