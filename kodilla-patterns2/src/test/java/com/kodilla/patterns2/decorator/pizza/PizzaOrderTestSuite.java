package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaExtraCheese() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(17), theCost);
        assertEquals("Margarita + extra cheese", description);
    }
    @Test
    public void testPizzaSausageOnionsChilly() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SausageDecorator(theOrder);
        theOrder = new OnionsDecorator(theOrder);
        theOrder = new ChilliDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(21), theCost);
        assertEquals("Margarita + sausage + onions + chili", description);
    }
    @Test
    public void testPizzaDoubleExtraCheeseDoubleSausageShrooms() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new SausageDecorator(theOrder);
        theOrder = new SausageDecorator(theOrder);
        theOrder = new ShroomsDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(27), theCost);
        assertEquals("Margarita + extra cheese + extra cheese + sausage + sausage + shrooms", description);
    }
}
