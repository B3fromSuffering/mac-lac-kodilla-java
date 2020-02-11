package com.kodilla.good.patterns.challenges.fly;

import java.util.Set;

public class UserActions {

    private FlightsFinderInterface flightsFinder;

    public UserActions(FlightsFinderInterface flightsFinder) {
        this.flightsFinder = flightsFinder;
    }

    public void action1(){
        City city = new City("Krakow");
        flightsFinder.findFrom(city);
    }

    public void action2(){
        flightsFinder.showFlights();
    }

    public void action3(){
        City city = new City("Warszawaa");
        flightsFinder.findTo(city);
    }

    public void action4(){
        City city = new City("Krakow");
        flightsFinder.findThrough(city);
    }


}
