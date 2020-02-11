package com.kodilla.good.patterns.challenges.fly;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsFinder implements FlightsFinderInterface{

    private final Set<Flight> flights;

    public FlightsFinder(Set<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public void findFrom(City city) {
        System.out.println("Searching flights from: " + city);
        Set<Flight> fly = flights.stream()
                .filter(flight -> flight.getFlightFrom().equals(city))
                .collect(Collectors.toSet());
        if(!fly.isEmpty()) {
            fly.forEach(System.out::println);
        } else {
            System.out.println("No results, try again.");
        }
    }

    @Override
    public void findTo(City city) {
        System.out.println("Searching flights to: " + city);
        Set<Flight> fly = flights.stream()
                .filter(flight -> flight.getFlightTo().equals(city))
                .collect(Collectors.toSet());
        if(!fly.isEmpty()) {
            fly.forEach(System.out::println);
        } else {
            System.out.println("No results, try again.");
        }
    }

    @Override
    public void findThrough(City city) {
        Set<FlightThrough> flightThrough = new HashSet<>();
        System.out.println("Searching flights through: " + city + "...");

        Set<Flight> citiesTo = flights.stream()
                .filter(flight -> flight.getFlightTo().equals(city))
                .collect(Collectors.toSet());
        flights.stream()
                .filter(flight -> flight.getFlightFrom().equals(city))
                .forEach(flight -> (citiesTo.stream())
                        .filter(flight1 -> (!flight1.getFlightFrom().equals(flight.getFlightTo())))
                        .forEach(flight1 -> flightThrough.add(new FlightThrough(flight1.getFlightFrom(), city, flight.getFlightTo()))));

        if(!flightThrough.isEmpty()) {
            flightThrough.forEach(System.out::println);
        } else {
            System.out.println("No results, try again.");
        }
    }

    @Override
    public void showFlights() {
        System.out.println("List of all available flights:");
        flights.forEach(System.out::println);
    }
}
