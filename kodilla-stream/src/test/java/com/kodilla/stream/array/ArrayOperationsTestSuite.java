package com.kodilla.stream.array;


import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        int[] numbers = new int[]{10, 12, 14, 20, 23, 27, 29};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(19.2857, average, 0.0001);
    }
}
