package com.kodilla.good.patterns.challenges.fly;

public interface FlightsFinderInterface {

    public void findFrom(City city);

    public void findTo(City city);

    public void findThrough(City city);

    public void showFlights();
}
