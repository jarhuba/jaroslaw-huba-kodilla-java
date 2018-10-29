package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    public static int counter = 0;

    @Before
    public void before() {
        System.out.println("Test " + counter);
        counter++;
    }

    @Test
    public void testCalculateAdvStatisticsMock0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        usersList.add("John");
        usersList.add("Nick");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsMock1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        usersList.add("John");
        usersList.add("Nick");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(500, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsMock0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        usersList.add("John");
        usersList.add("Nick");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
    }

    @Test
    public void testCalculateAdvStatisticsMockPostsMoreThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersList = new ArrayList<String>() {
            @Override
            public int size() {
                return 10;
            }
        };
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(10, forumStatistics.getAverageCommentsPerUser());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsMockPostsLessThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersList = new ArrayList<String>() {
            @Override
            public int size() {
                return 10;
            }
        };
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(10, forumStatistics.getAverageCommentsPerUser());
        Assert.assertEquals(10, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsMock0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersList = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
    }

    @Test
    public void testCalculateAdvStatisticsMock100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersList = new ArrayList<String>() {
            @Override
            public int size() {
                return 100;
            }
        };
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(20, forumStatistics.getAverageCommentsPerUser());
        Assert.assertEquals(2, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testShowStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        usersList.add("John");
        usersList.add("Nick");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        String expectedMessage = "Średnia liczba postów na użytkownika to: 50 (10,500)";

        //Then
        Assert.assertEquals(expectedMessage, forumStatistics.showStatistics());
    }
}
