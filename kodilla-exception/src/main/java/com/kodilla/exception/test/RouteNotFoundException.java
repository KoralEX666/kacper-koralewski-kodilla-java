package com.kodilla.exception.test;

public class RouteNotFoundException  extends RuntimeException {

    public RouteNotFoundException(final String message) {
        System.out.println(message);
    }
}
