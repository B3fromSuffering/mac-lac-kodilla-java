package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {

    private List<Country> theListOfCountries = new ArrayList<>();

    public void addCountry(Country country){
        theListOfCountries.add(country);
    }

    public List<Country> getTheListOfCountries() {
        return theListOfCountries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(theListOfCountries, continent.theListOfCountries);
    }

}
