package com.kodilla.good.patterns.challenges.fly;

import java.util.Objects;

public class FlightThrough {

    private final City flightFrom;
    private final City flightThrough;
    private final City flightTo;

    public FlightThrough(City flightFrom, City flightThrough, City flightTo) {
        this.flightFrom = flightFrom;
        this.flightThrough = flightThrough;
        this.flightTo = flightTo;
    }

    public City getFlightFrom() {
        return flightFrom;
    }

    public City getFlightThrough() {
        return flightThrough;
    }

    public City getFlightTo() {
        return flightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightThrough that = (FlightThrough) o;
        return flightFrom.equals(that.flightFrom) &&
                flightThrough.equals(that.flightThrough) &&
                flightTo.equals(that.flightTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightFrom, flightThrough, flightTo);
    }

    @Override
    public String toString() {
        return "flight from: " + flightFrom +
                " through: " + flightThrough +
                " to: " + flightTo;
    }
}
