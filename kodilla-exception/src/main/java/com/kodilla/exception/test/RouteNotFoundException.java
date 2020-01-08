package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception{

    String airportName;

    public RouteNotFoundException(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public String toString() {
        return  airportName;
    }
}
