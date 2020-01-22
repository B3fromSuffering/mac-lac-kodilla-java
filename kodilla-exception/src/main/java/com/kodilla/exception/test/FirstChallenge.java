package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        double result = 0;

        if (b == 0) {
            throw new ArithmeticException();
        } else {
            result = a / b;
        }
        return result;
    }


    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {

            double result = firstChallenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("You cannot divide by 0!");

        } finally {

            System.out.println("division completed!");

        }
    }
}
