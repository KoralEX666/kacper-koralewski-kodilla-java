package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;
    private final String location;

    public Country(String countryName, BigDecimal peopleQuantity, String location) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
        this.location = location;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", PeopleQuantity=" + peopleQuantity +
                ", location='" + location + '\'' +
                '}';
    }
}
