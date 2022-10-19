package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Continent {

    private final Set<Country> countryList = new HashSet<>();

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public boolean removeCountry(Country country) {
        return countryList.remove(country);
    }

    public Set<Country> getContinentList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(countryList, continent.countryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryList);
    }
}
