package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(2.0 , 1.5));
        } catch (Exception e) {
            System.out.println("Hey! You cannot use x >= 2 || x < 1 || y == 1.5");
        } finally {
            System.out.println("This is the end, my friend!");
        }
    }
}
