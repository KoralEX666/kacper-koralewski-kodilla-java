package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;
import com.kodilla.stream.sand.SandStorage;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class World {

    private final Set<Continent> continentList = new HashSet<>();

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return continentList.remove(continent);
    }

    public Set<Continent> getContinentList() {
        return continentList;
    }


    public BigDecimal getPeopleQuantity(){
        return continentList.stream()
                .flatMap(continent -> continent.getContinentList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world = (World) o;
        return Objects.equals(continentList, world.continentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentList);
    }
}

