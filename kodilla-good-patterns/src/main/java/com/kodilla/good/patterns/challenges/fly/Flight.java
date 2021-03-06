package com.kodilla.good.patterns.challenges.fly;

import java.util.Objects;

public class Flight {

    private final City flightFrom;
    private final City flightTo;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightFrom.equals(flight.flightFrom) &&
                flightTo.equals(flight.flightTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightFrom, flightTo);
    }

    @Override
    public String toString() {
        return "flight from: " + flightFrom +
                ", to: " + flightTo;
    }
}
