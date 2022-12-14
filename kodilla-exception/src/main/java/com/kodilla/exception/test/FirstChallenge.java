package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        System.out.println("First test, divide by 0");
        try{
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Oh no! Something went wrong! Error:" + e);
        }
        System.out.println("Second test, divide by 5");
        try{
            double result = firstChallenge.divide(3, 5);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Oh no! Something went wrong! Error:" + e);
        } finally {
            System.out.println("All test done");
        }

    }
}