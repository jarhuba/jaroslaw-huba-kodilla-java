package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ForumTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCaseUsername() {
        //Given
        SimpleUser simpleuser = new SimpleUser("theForumUser", "John Smith");
        //When
        String resoult = simpleuser.getUsername();
        System.out.println("Testing " + resoult);
        //Then
        Assert.assertEquals("theForumUser", resoult);
    }

    @Test
    public void testCaseRealName() {
        //Given
        SimpleUser simpleuser = new SimpleUser("theForumUser", "John Smith");
        //When
        String resoult = simpleuser.getRealName();
        System.out.println("Testing " + resoult);
        //Then
        Assert.assertEquals("John Smith", resoult);
    }
}
