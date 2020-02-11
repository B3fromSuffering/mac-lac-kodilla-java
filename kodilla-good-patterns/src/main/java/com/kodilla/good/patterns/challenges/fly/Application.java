package com.kodilla.good.patterns.challenges.fly;

public class Application {

    public static void main(String[] args) {

        FlightsDataBase flightsDataBase = new FlightsDataBase();
        FlightsFinder flightsFinder = new FlightsFinder(flightsDataBase.getFlights());
        UserActions userActions = new UserActions(flightsFinder);

        userActions.action1();
        userActions.action2();
        userActions.action3();
        userActions.action4();
    }
}
