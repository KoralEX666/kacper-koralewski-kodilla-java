package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;
import com.kodilla.stream.world.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {


    @Test
    void testGetPeopleQuantity(){
        //Given
        //Create countries
        Country country01 = new Country("Poland", new BigDecimal("38014000"), "Europe");
        Country country02 = new Country("Italy", new BigDecimal("58867239"), "Europe");
        Country country03 = new Country("Netherlands", new BigDecimal("17748410"), "Europe");
        Country country04 = new Country("Italy", new BigDecimal("58867239"), "Europe");
        Country country05 = new Country("Netherlands", new BigDecimal("17748410"), "Europe");

        Country country11 = new Country("Nigeria", new BigDecimal("216747000"), "Africa");
        Country country12 = new Country("Ethiopia", new BigDecimal("105163988"), "Africa");
        Country country13 = new Country("Egypt", new BigDecimal("95241000"), "Africa");

        Country country21 = new Country("China", new BigDecimal("1412600000"), "Asia");
        Country country22 = new Country("India", new BigDecimal("1375586000"), "Asia");
        Country country23 = new Country("Indonesia", new BigDecimal("275773800"), "Asia");

        Country country31 = new Country("USA", new BigDecimal("331893745"), "North America");
        Country country32 = new Country("Mexico", new BigDecimal("128533664"), "North America");
        Country country33 = new Country("Canada", new BigDecimal("38957630"), "North America");

        Country country41 = new Country("Australia", new BigDecimal("25974609"), "Oceania");
        Country country42 = new Country("Papua New Guinea", new BigDecimal("9122994"), "Oceania");
        Country country43 = new Country("New Zealand", new BigDecimal("5129460"), "Oceania");

        Country country51 = new Country("Brazil", new BigDecimal("215209162"), "South America");
        Country country52 = new Country("Colombia", new BigDecimal("51049498"), "South America");
        Country country53 = new Country("Argentina", new BigDecimal("47327407"), "South America");


        //Create continents country lists

        Continent europe = new Continent();
        europe.addCountry(country01);
        europe.addCountry(country02);
        europe.addCountry(country03);
        europe.addCountry(country04);
        europe.addCountry(country05);

        Continent africa = new Continent();
        africa.addCountry(country11);
        africa.addCountry(country12);
        africa.addCountry(country13);

        Continent asia = new Continent();
        asia.addCountry(country21);
        asia.addCountry(country22);
        asia.addCountry(country23);

        Continent northAmerica = new Continent();
        northAmerica.addCountry(country31);
        northAmerica.addCountry(country32);
        northAmerica.addCountry(country33);

        Continent oceania = new Continent();
        oceania.addCountry(country41);
        oceania.addCountry(country42);
        oceania.addCountry(country43);

        Continent southAmerica = new Continent();
        southAmerica.addCountry(country51);
        southAmerica.addCountry(country52);
        southAmerica.addCountry(country53);

        //When
        //Create World list
        World world=new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        world.addContinent(oceania);
        world.addContinent(southAmerica);

        //Then
        BigDecimal worldPopulation = BigDecimal.ZERO;
        worldPopulation = world.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("4525555255");
        assertEquals(expectedPopulation, worldPopulation);
    }
}
