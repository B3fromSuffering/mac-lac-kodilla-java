package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        for(int n = 1; n<20; n++){
            numbers.add(n);
        }

        ArrayList<Integer> evenNumbers = oddNumbersExterminator.exterminate(numbers);
        System.out.println("This are even numbers" + evenNumbers);
    }
}
