package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("list1")
    TaskList taskList1;

    @Autowired
    @Qualifier("list2")
    TaskList taskList2;

    @Autowired
    @Qualifier("list3")
    TaskList taskList3;

    @Bean
    public Board getBoard() {
        return new Board(taskList1, taskList2, taskList3);
    }

    @Bean(name = "list1")
    @Scope("prototype")
    public TaskList getListToDo() {
        return new TaskList();
    }

    @Bean(name = "list2")
    @Scope("prototype")
    public TaskList getListInProgress() {
        return new TaskList();
    }

    @Bean(name = "list3")
    @Scope("prototype")
    public TaskList getListDone() {
        return new TaskList();
    }
}
