package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsMock0Users0Posts0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersList = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(0, forumStatistics.averagePostsPerUser);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerUser);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerPost);
    }


    @Test
    public void testCalculateAdvStatisticsMock100Users1000Posts2000Comments() {
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
        Assert.assertEquals(10, forumStatistics.averagePostsPerUser);
        Assert.assertEquals(20, forumStatistics.averageCommentsPerUser);
        Assert.assertEquals(2, forumStatistics.averageCommentsPerPost);
    }

    @Test
    public void testCalculateAdvStatisticsMock10Users1000Posts100Comments() {
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
        Assert.assertEquals(100, forumStatistics.averagePostsPerUser);
        Assert.assertEquals(10, forumStatistics.averageCommentsPerUser);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerPost);
    }
}
