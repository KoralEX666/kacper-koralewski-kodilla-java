package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        HashMap<String, List<String>> airportMap;
        airportMap = FlightMap.createTestMap();
        String depAir = "Warszawa";
        String depAirportTwo = "Lodz";
        String arrAir = "Rzeszow";
        String arrAirTwo = "Lodz";
        String arrAirThree = "Torun";

        System.out.println("Looking for direct flights from "+depAir+" to "+arrAir);
        FlightMap.searchFlights(depAir, arrAir, 1, airportMap);

        System.out.println("Looking for direct flights from "+depAir+" to "+arrAirTwo);
        FlightMap.searchFlights(depAir, arrAirTwo, 1, airportMap);

        System.out.println("");
        System.out.println("Looking for flights possible to "+ arrAir);
        FlightMap.searchFlights(depAir, arrAir, 2, airportMap);
        System.out.println("Looking for flights possible to "+ arrAirThree);
        FlightMap.searchFlights(depAir, arrAirThree, 2, airportMap);

        System.out.println("");
        System.out.println("Looking for flights with one transfer starting from "+depAir+" with final arrival to "+arrAir);
        FlightMap.searchFlights(depAir, arrAir, 3, airportMap);
        System.out.println("Looking for flights with one transfer starting from "+depAirportTwo+" with final arrival to "+arrAir);
        FlightMap.searchFlights(depAirportTwo, arrAir, 3, airportMap);

        System.out.println("");
        System.out.println("Looking for flights with incorrect mode");
        FlightMap.searchFlights(depAir, arrAir, 4, airportMap);

        System.out.println("");
        System.out.println("Looking for flights with incorrect 'null' information");
        FlightMap.searchFlights(null , arrAir, 1, airportMap);

    }

}
