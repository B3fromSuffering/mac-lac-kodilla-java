package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException{

        boolean logic = true;           // zmienna pomocnicza

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Aberdeen", true);
        airports.put("Barcelona", true);
        airports.put("Belfast", true);
        airports.put("Berlin", false);
        airports.put("Dublin", false);
        airports.put("Frankfurt", true);
        airports.put("Ibiza", true);
        airports.put("London Luton", true);
        airports.put("Mykonos Island ", true);
        airports.put("Paris Orly", false);

        if (!airports.containsKey(flight.getDepartureAirport())){
            throw new RouteNotFoundException(flight.getDepartureAirport());
        }
        if (!airports.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException(flight.getArrivalAirport());
        }

        if (flight.getDepartureAirport().equals(flight.getArrivalAirport())){
            System.out.println("Your departure and arrival airport is the same airport lol!");
            logic = false;
        } else {
            if (!airports.get(flight.getDepartureAirport())) {
                System.out.println(flight.getDepartureAirport() + " Airport is unavaliable!");
                logic = false;
            }
            if (!airports.get(flight.getArrivalAirport())) {
                System.out.println(flight.getArrivalAirport() + " Airport is unavaliable!");
                logic = false;
            }
        }

        if(logic){
            System.out.println("You can fly from: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport());
        }
    }

    public static void main(String args[]){

        Flight flight = new Flight("Dublina", "Dublin");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
        } catch(RouteNotFoundException e) {
            System.out.println("I cannot find that airport: " + e);
            System.out.println("Please try again...");
        } finally {
            System.out.println("Thank You for using our services!");
        }
    }
}
