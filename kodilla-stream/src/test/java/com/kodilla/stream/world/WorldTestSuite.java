package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country polska = new Country(new BigDecimal("37000000"));
        Country niemcy = new Country(new BigDecimal("80000000"));
        Country francja = new Country(new BigDecimal("60000000"));
        Country szwecja = new Country(new BigDecimal("10000000"));
        Continent europe = new Continent();
        europe.addCountry(polska);
        europe.addCountry(niemcy);
        europe.addCountry(francja);
        europe.addCountry(szwecja);
        Country chiny = new Country(new BigDecimal("1370000000"));
        Country indie = new Country(new BigDecimal("1100000000"));
        Country japonia = new Country(new BigDecimal("137000000"));
        Country filipiny = new Country(new BigDecimal("200000000"));
        Continent azja = new Continent();
        europe.addCountry(chiny);
        europe.addCountry(indie);
        europe.addCountry(japonia);
        europe.addCountry(filipiny);
        Country usa = new Country(new BigDecimal("340000000"));
        Country kanada = new Country(new BigDecimal("7000000"));
        Continent ameryka = new Continent();
        europe.addCountry(usa);
        europe.addCountry(kanada);
        World world = new World();
        world.addContinent(europe);
        world.addContinent(azja);
        world.addContinent(ameryka);

        //While
        BigDecimal expectedResult = new BigDecimal("3341000000");
        BigDecimal calculatedResult = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(expectedResult, calculatedResult);
    }
}
