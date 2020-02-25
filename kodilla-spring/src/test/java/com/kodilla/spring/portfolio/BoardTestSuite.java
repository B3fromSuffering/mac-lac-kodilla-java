package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = (Board)context.getBean(Board.class);
        //When
        board.getToDoList().addTask("task1");
        board.getInProgressList().addTask("task2");
        board.getDoneList().addTask("task3");
        //Then
        Assert.assertEquals("Board{toDoList= [task1], inProgressList= [task2], doneList= [task3]}", board.toString());
    }
}
