package com.kodilla.good.patterns.challenges.fly;

public class Flight {

    private City flightFrom;
    private City flightTo;

    public Flight(City flightFrom, City flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public City getFlightFrom() {
        return flightFrom;
    }

    public City getFlightTo() {
        return flightTo;
    }
}
