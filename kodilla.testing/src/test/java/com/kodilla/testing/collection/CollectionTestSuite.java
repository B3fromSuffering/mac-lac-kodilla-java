package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> nullList = null;
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing " + "empty list");
        //then
        Assert.assertEquals(nullList, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(31);
        numbers.add(32);
        numbers.add(1111);
        numbers.add(2000);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(32);
        evenNumbers.add(2000);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing " + result);
        //then
        Assert.assertEquals(evenNumbers, result);
    }
}
