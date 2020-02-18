package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        double a = 6.6;
        double b = 2.0;
        //When
        double addresult = context.getBean(Calculator.class).add(a,b);
        double subresult = context.getBean(Calculator.class).sub(a,b);
        double mulresult = context.getBean(Calculator.class).mul(a,b);
        double divresult = context.getBean(Calculator.class).div(a,b);
        //Then
        Assert.assertEquals(addresult, 8.6, 0.001);
        Assert.assertEquals(subresult, 4.6, 0.001);
        Assert.assertEquals(mulresult, 13.2, 0.001);
        Assert.assertEquals(divresult, 3.3, 0.001);
    }
}
