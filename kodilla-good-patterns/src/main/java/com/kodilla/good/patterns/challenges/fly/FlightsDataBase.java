package com.kodilla.good.patterns.challenges.fly;

import java.util.HashSet;
import java.util.Set;

public class FlightsDataBase implements FlightsDataBaseInterface {

    private final City warszawa = new City("Warszawa");
    private final City wroclaw = new City("Wroclaw");
    private final City poznan = new City("Poznan");
    private final City krakow = new City("Krakow");
    private final City katowice = new City("Katowice");
    private final City lodz = new City("Lodz");
    private final City gdansk = new City("Gdansk");
    private final City bydgoszcz = new City("Bydgoszcz");

    private final Flight warszawaWroclaw = new Flight(warszawa, wroclaw);
    private final Flight warszawaPoznan = new Flight(warszawa, poznan);
    private final Flight warszawaKrakow = new Flight(warszawa, krakow);
    private final Flight warszawaKatowice = new Flight(warszawa, katowice);
    private final Flight warszawaLodz = new Flight(warszawa, lodz);
    private final Flight warszawaGdansk = new Flight(warszawa, gdansk);
    private final Flight warszawaBydgoszcz = new Flight(warszawa, bydgoszcz);
    private final Flight wroclawWarszawa = new Flight(wroclaw, warszawa);
    private final Flight wroclawPoznan = new Flight(wroclaw, poznan);
    private final Flight wroclawKrakow = new Flight(wroclaw, krakow);
    private final Flight wroclawKatowice = new Flight(wroclaw, katowice);
    private final Flight wroclawLodz = new Flight(wroclaw, lodz);
    private final Flight wroclawGdansk = new Flight(wroclaw, gdansk);
    private final Flight wroclawBydgoszcz = new Flight(wroclaw, bydgoszcz);
    private final Flight poznanWarszawa = new Flight(poznan, warszawa);
    private final Flight krakowWarszawa = new Flight(krakow, warszawa);
    private final Flight katowiceWarszawa = new Flight(katowice, warszawa);
    private final Flight lodzWarszawa = new Flight(lodz, warszawa);
    private final Flight gdanskWarszawa = new Flight(gdansk, warszawa);
    private final Flight bydgoszczWarszawa = new Flight(bydgoszcz, warszawa);
    private final Flight poznanWroclaw = new Flight(poznan, wroclaw);
    private final Flight krakowWroclaw = new Flight(krakow, wroclaw);
    private final Flight katowiceWroclaw = new Flight(katowice, wroclaw);
    private final Flight lodzWroclaw = new Flight(lodz, wroclaw);
    private final Flight gdanskWroclaw = new Flight(gdansk, wroclaw);
    private final Flight bydgoszczWroclaw = new Flight(bydgoszcz, wroclaw);
    private final Flight krakowGdansk = new Flight(krakow, gdansk);
    private final Flight gdanskKrakow = new Flight(gdansk, krakow);

    public Set<Flight> getFlights() {

        final Set<Flight> flights = new HashSet<>();
        flights.add(katowiceWroclaw);
        flights.add(lodzWroclaw);
        flights.add(gdanskWroclaw);
        flights.add(bydgoszczWroclaw);

        flights.add(poznanWarszawa);
        flights.add(krakowWarszawa);
        flights.add(katowiceWarszawa);
        flights.add(lodzWarszawa);
        flights.add(gdanskWarszawa);
        flights.add(bydgoszczWarszawa);
        flights.add(poznanWroclaw);
        flights.add(krakowWroclaw);

        flights.add(warszawaWroclaw);
        flights.add(warszawaPoznan);
        flights.add(warszawaKrakow);
        flights.add(warszawaKatowice);
        flights.add(warszawaLodz);
        flights.add(warszawaGdansk);
        flights.add(warszawaBydgoszcz);
        flights.add(wroclawKatowice);
        flights.add(warszawaBydgoszcz);
        flights.add(wroclawGdansk);
        flights.add(wroclawKrakow);
        flights.add(wroclawLodz);
        flights.add(wroclawPoznan);
        flights.add(wroclawWarszawa);
        flights.add(wroclawBydgoszcz);
        flights.add(krakowGdansk);
        flights.add(gdanskKrakow);
        return new HashSet<Flight>(flights);
    }
}
