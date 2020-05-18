package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuit {
    @Test
    public void taskUpdate() {
        //Given
        TaskQueue JohnTasks = new TaskQueue("John");
        TaskQueue AdamTasks = new TaskQueue("Adam");
        TaskQueue MerryTasks = new TaskQueue("Merry");
        TaskQueue AnnaTasks = new TaskQueue("Anna");
        Mentor mentorGeorg = new Mentor("Georg");
        Mentor mentorSamuel = new Mentor("Samuel");
        JohnTasks.registerObserver(mentorGeorg);
        AdamTasks.registerObserver(mentorGeorg);
        MerryTasks.registerObserver(mentorGeorg);
        MerryTasks.registerObserver(mentorSamuel);
        AnnaTasks.registerObserver(mentorSamuel);
        //When
        JohnTasks.addTask("1st task");
        JohnTasks.addTask("2nd task");
        JohnTasks.addTask("3rd task");
        AdamTasks.addTask("1st task");
        AdamTasks.addTask("2nd task");
        MerryTasks.addTask("2nd task");
        MerryTasks.addTask("1st task");
        AnnaTasks.addTask("1st task");
        //Then
        assertEquals(7, mentorGeorg.getUpdateCount());
        assertEquals(3, mentorSamuel.getUpdateCount());
    }
}
