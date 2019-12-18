package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuit {
    @Before
    public void beforeEveryTest() {
        System.out.println("Preparing to execute test");
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test finished");
    }

    @Test
    public void testCalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("Annon");
        userNames.add("Dennon");
        userNames.add("Rambo");
        userNames.add("Xoxo");
        userNames.add("Xanax");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(55);
        when(statisticsMock.postsCount()).thenReturn(20);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, statisticsCalculator.usersQuantity);
        Assert.assertEquals(55, statisticsCalculator.commentsQuantity);
        Assert.assertEquals(20, statisticsCalculator.postsQuantity);
        Assert.assertEquals(4, statisticsCalculator.averagePostsPerUser, 0.001);
        Assert.assertEquals(11, statisticsCalculator.averageCommentsPerUser, 0.001);
        Assert.assertEquals(2.75, statisticsCalculator.averageCommentsPerPost, 0.001);
    }
    @Test           // gdy liczba postów = 0,
    public void testCalculateAveragesNoPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("Annon");
        userNames.add("Dennon");
        userNames.add("Rambo");
        userNames.add("Xoxo");
        userNames.add("Xanax");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(55);
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, statisticsCalculator.usersQuantity);
        Assert.assertEquals(55, statisticsCalculator.commentsQuantity);
        Assert.assertEquals(0, statisticsCalculator.postsQuantity);
        Assert.assertEquals(0, statisticsCalculator.averagePostsPerUser, 0.001);
        Assert.assertEquals(11, statisticsCalculator.averageCommentsPerUser, 0.001);
        Assert.assertEquals(0, statisticsCalculator.averageCommentsPerPost, 0.001);
    }
    @Test           // gdy liczba postów = 1000,,
    public void testCalculateAveragesThousandPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("Annon");
        userNames.add("Dennon");
        userNames.add("Rambo");
        userNames.add("Xoxo");
        userNames.add("Xanax");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(55);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, statisticsCalculator.usersQuantity);
        Assert.assertEquals(55, statisticsCalculator.commentsQuantity);
        Assert.assertEquals(1000, statisticsCalculator.postsQuantity);
        Assert.assertEquals(200, statisticsCalculator.averagePostsPerUser, 0.001);
        Assert.assertEquals(11, statisticsCalculator.averageCommentsPerUser, 0.001);
        Assert.assertEquals(0.055, statisticsCalculator.averageCommentsPerPost, 0.001);
    }
    @Test           // gdy liczba komentarzy = 0,
    public void testCalculateAveragesNoComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("Annon");
        userNames.add("Dennon");
        userNames.add("Rambo");
        userNames.add("Xoxo");
        userNames.add("Xanax");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(20);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, statisticsCalculator.usersQuantity);
        Assert.assertEquals(0, statisticsCalculator.commentsQuantity);
        Assert.assertEquals(20, statisticsCalculator.postsQuantity);
        Assert.assertEquals(4, statisticsCalculator.averagePostsPerUser, 0.001);
        Assert.assertEquals(0, statisticsCalculator.averageCommentsPerUser, 0.001);
        Assert.assertEquals(0, statisticsCalculator.averageCommentsPerPost, 0.001);
    }
    @Test           //gdy liczba komentarzy < liczba postów
    public void testCalculateAveragesMorePostsThanComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("Annon");
        userNames.add("Dennon");
        userNames.add("Rambo");
        userNames.add("Xoxo");
        userNames.add("Xanax");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(55);
        when(statisticsMock.postsCount()).thenReturn(200);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, statisticsCalculator.usersQuantity);
        Assert.assertEquals(55, statisticsCalculator.commentsQuantity);
        Assert.assertEquals(200, statisticsCalculator.postsQuantity);
        Assert.assertEquals(40, statisticsCalculator.averagePostsPerUser, 0.001);
        Assert.assertEquals(11, statisticsCalculator.averageCommentsPerUser, 0.001);
        Assert.assertEquals(0.275, statisticsCalculator.averageCommentsPerPost, 0.001);
    }
    @Test           //gdy liczba komentarzy > liczba postów,
    public void testCalculateAveragesMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("Annon");
        userNames.add("Dennon");
        userNames.add("Rambo");
        userNames.add("Xoxo");
        userNames.add("Xanax");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(550);
        when(statisticsMock.postsCount()).thenReturn(20);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, statisticsCalculator.usersQuantity);
        Assert.assertEquals(550, statisticsCalculator.commentsQuantity);
        Assert.assertEquals(20, statisticsCalculator.postsQuantity);
        Assert.assertEquals(4, statisticsCalculator.averagePostsPerUser, 0.001);
        Assert.assertEquals(110, statisticsCalculator.averageCommentsPerUser, 0.001);
        Assert.assertEquals(27.5, statisticsCalculator.averageCommentsPerPost, 0.001);
    }
    @Test           //gdy liczba użytkowników = 0,
    public void testCalculateAveragesNoUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList<String> userNames = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(55);
        when(statisticsMock.postsCount()).thenReturn(20);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCalculator.usersQuantity);
        Assert.assertEquals(55, statisticsCalculator.commentsQuantity);
        Assert.assertEquals(20, statisticsCalculator.postsQuantity);
        Assert.assertEquals(0, statisticsCalculator.averagePostsPerUser, 0.001);
        Assert.assertEquals(0, statisticsCalculator.averageCommentsPerUser, 0.001);
        Assert.assertEquals(2.75, statisticsCalculator.averageCommentsPerPost, 0.001);
    }
    @Test           //gdy liczba użytkowników = 100.
    public void testCalculateAveragesHundredUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList<String> userNames = new ArrayList<String>();
        for(int n=0; n<100; n++){
            String userName = "User" + Integer.toString(n);
            userNames.add(userName);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(55);
        when(statisticsMock.postsCount()).thenReturn(20);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statisticsCalculator.usersQuantity);
        Assert.assertEquals(55, statisticsCalculator.commentsQuantity);
        Assert.assertEquals(20, statisticsCalculator.postsQuantity);
        Assert.assertEquals(0.2, statisticsCalculator.averagePostsPerUser, 0.001);
        Assert.assertEquals(0.55, statisticsCalculator.averageCommentsPerUser, 0.001);
        Assert.assertEquals(2.75, statisticsCalculator.averageCommentsPerPost, 0.001);
    }
}
