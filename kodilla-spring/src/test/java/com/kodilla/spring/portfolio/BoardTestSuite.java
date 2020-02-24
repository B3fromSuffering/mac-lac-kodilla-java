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
        TaskList taskListToDo = (TaskList)context.getBean("list1");
        //When
        board.getToDoList().addTask("task1");
        board.getInProgressList().addTask("task2");
        board.getDoneList().addTask("task3");
        //Then
        //Assert.assertEquals(((TaskList)context.getBean("list1")).tasks.get(0).toString(), "task1");
        System.out.println(((TaskList)context.getBean("list1")).tasks);
    }
}
