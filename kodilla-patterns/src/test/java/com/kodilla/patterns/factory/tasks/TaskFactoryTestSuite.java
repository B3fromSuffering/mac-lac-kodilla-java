package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task driving = taskFactory.makeTask(taskFactory.DrivingTask);
        driving.executeTask();
        //then
        Assert.assertEquals("Jedziemy do koleżanki", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task painting = taskFactory.makeTask(taskFactory.PaintingTask);
        painting.executeTask();
        //then
        Assert.assertEquals("Malowanie ścian", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task shopping = taskFactory.makeTask(taskFactory.ShoppingTask);
        shopping.executeTask();
        //then
        Assert.assertEquals("Zakupy w Biedronce", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }
}
