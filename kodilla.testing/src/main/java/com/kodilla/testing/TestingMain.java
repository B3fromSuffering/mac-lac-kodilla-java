package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // Kalkulator test

        System.out.println("Running calculator test...");
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;

        if(calculator.add(a, b) == a + b){
            System.out.println("adding test OK");
        } else {
            System.out.println("Error!");
        }

        if(calculator.substract(a, b) == a - b){
            System.out.println("substracting test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
