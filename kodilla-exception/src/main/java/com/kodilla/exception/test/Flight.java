package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Flight {
    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public static void findFilght(Flight flight) throws RouteNotFoundException{
        if (flight != null) {

        Map<String, Boolean> testMap = new HashMap<>();
        testMap.put("Aberdeen", false);
        testMap.put("Alicante", false);
        testMap.put("Amsterdam", true);
        testMap.put("Athens", true);
        testMap.put("Barcelona", false);
        testMap.put("Belfast", false);
        testMap.put("Bergen", true);
        testMap.put("Berlin", false);
        testMap.put("Birmingham", true);
        testMap.put("Bologna", false);
        testMap.put("Bordeaux", true);

        Flight testFlight = flight;

        if (testMap.get(flight.getArrivalAirport())!=null && testMap.get(flight.getDepartureAirport())!=null){
            boolean startingAirport = testMap.get(flight.getDepartureAirport());
            boolean endingAirport = testMap.get(flight.getArrivalAirport());
            if (startingAirport==false && endingAirport==false){
                throw new RouteNotFoundException("Flight impossible. Both of airports are unavailable");
            } else if (startingAirport==false){
                throw new RouteNotFoundException("Flight impossible. Departure airport ("+flight.getDepartureAirport()+") is unavailable");
            } else if (endingAirport==false){
                throw new RouteNotFoundException("Flight impossible. Arrival airport ("+flight.getArrivalAirport()+") is unavailable");
            } else {
                System.out.println("Flight from: "+flight.getDepartureAirport()+" to: ("+flight.getArrivalAirport()+") is possible");
            }
        } else if (testMap.get(flight.getArrivalAirport())==null && testMap.get(flight.getDepartureAirport())==null){
            throw new RouteNotFoundException("Flight impossible. Both of airports are doesn't exist");
        } else if (testMap.get(flight.getArrivalAirport())==null){
            throw new RouteNotFoundException("Flight impossible. Arrival airport ("+flight.getArrivalAirport()+") is doesn't exist");
        }else if (testMap.get(flight.getDepartureAirport())==null){
            throw new RouteNotFoundException("Flight impossible. Departure airport ("+flight.getDepartureAirport()+") is doesn't exist");
        }
    }else {
            throw new RouteNotFoundException("Object flight was null");
        }

    }

    public static void main(String[] args) throws RouteNotFoundException {
        Flight testFlightOne = new Flight("Bergen", "Amsterdam");
        Flight testFlightTwo = new Flight("Aberdeen", "Amsterdam");
        Flight testFlightThree = new Flight("Bergen", "Alicante");
        Flight testFlightFour = new Flight("Warsaw", "Amsterdam");
        Flight testFlightFife = new Flight("Bergen", "Prague");
        Flight testFlightSix = new Flight("Warsaw", "Prague");

        try{
            findFilght(testFlightOne);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try{
            findFilght(testFlightTwo);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try{
            findFilght(testFlightThree);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try{
            findFilght(testFlightFour);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try{
            findFilght(testFlightFife);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try{
            findFilght(testFlightSix);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }




    }


}
