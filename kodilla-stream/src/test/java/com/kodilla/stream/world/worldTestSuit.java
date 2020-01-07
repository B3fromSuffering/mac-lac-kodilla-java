package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class worldTestSuit {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("30000000"));
        Country germany = new Country("Germany", new BigDecimal("80000000"));
        Country france = new Country("France", new BigDecimal("65000000"));
        Country italy = new Country("Italy", new BigDecimal("60000000"));
        Country greece = new Country("Greece", new BigDecimal("10000000"));
        Country portugal = new Country("Portugal", new BigDecimal("10000000"));

        Country china = new Country("China", new BigDecimal("1370000000"));
        Country india = new Country("India", new BigDecimal("1300000000"));
        Country indonesia = new Country("Indonesia", new BigDecimal("255000000"));
        Country pakistan = new Country("Pakistan", new BigDecimal("191000000"));
        Country japan = new Country("Japan", new BigDecimal("125000000"));
        Country iran = new Country("Iran", new BigDecimal("78000000"));

        Country nigeria = new Country("Nigeria", new BigDecimal("200000000"));
        Country egypt = new Country("Egypt", new BigDecimal("98000000"));
        Country tanzania = new Country("Tanzania", new BigDecimal("51000000"));
        Country uganda = new Country("Uganda", new BigDecimal("34000000"));
        Country maroco = new Country("Maroco", new BigDecimal("33000000"));
        Country cameroon = new Country("Cameroon", new BigDecimal("22000000"));

        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(italy);
        europe.addCountry(greece);
        europe.addCountry(portugal);

        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(indonesia);
        asia.addCountry(india);
        asia.addCountry(pakistan);
        asia.addCountry(japan);
        asia.addCountry(iran);

        Continent africa = new Continent();
        africa.addCountry(nigeria);
        africa.addCountry(egypt);
        africa.addCountry(tanzania);
        africa.addCountry(uganda);
        africa.addCountry(maroco);
        africa.addCountry(cameroon);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

       /* BigDecimal totalPopulation = BigDecimal.ZERO;
        for(Continent continent: world.getTheListOfContinents()){
            for (Country country: continent.getTheListOfCountries()) {
                totalPopulation = totalPopulation.add(country.getPeopleQuantity());
            }
        }*/


        //Then
        BigDecimal expectedPopulation = new BigDecimal("4012000000");
        Assert.assertEquals(expectedPopulation, totalPopulation);
    }


}
