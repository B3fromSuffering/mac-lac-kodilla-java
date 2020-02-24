package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest(){
        //Given
        //When
        Logger.getInstanceOf().log("log0001");
        //Then
        Assert.assertEquals(Logger.getInstanceOf().getLastLog(), "log0001");
    }
}
