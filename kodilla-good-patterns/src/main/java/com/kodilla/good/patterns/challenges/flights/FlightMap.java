package com.kodilla.good.patterns.challenges.flights;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class FlightMap {
    public String depAirport;
    public String arrAirport;
    public int mode;
    public String getDepAirport() {
        return depAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightMap flightMap = (FlightMap) o;

        if (mode != flightMap.mode) return false;
        if (!depAirport.equals(flightMap.depAirport)) return false;
        return arrAirport.equals(flightMap.arrAirport);
    }

    @Override
    public int hashCode() {
        int result = depAirport.hashCode();
        result = 31 * result + arrAirport.hashCode();
        result = 31 * result + mode;
        return result;
    }

    public static void searchFlights(String depAirport, String arrAirport, Integer mode, HashMap<String, List<String>>  fligtsMap){
        if (depAirport!=null && arrAirport!=null && fligtsMap!=null){
            if(mode == 1){
                List<String>potentialAirports = fligtsMap.get(depAirport);
                List<String> result = potentialAirports.stream()
                        .filter(arrAirport::equals).toList();
                if (result.size()>0){
                    System.out.println("Flight possible");
                } else {
                    System.out.println("Flight impossible");
                }
            } else if (mode == 2) {
                Set<String> setAirports = fligtsMap.keySet();
                String[] arrayOfdeptAirports = setAirports.toArray(String[]::new);
                List<String> listOfdeptAirports = new ArrayList<String>(Arrays.asList(arrayOfdeptAirports));

                List<String> resultList = new ArrayList<>();
                for (int i = 0; i < listOfdeptAirports.size(); i++) {

                    String testAirport = listOfdeptAirports.get(i);
                    List<String> potentialAirp = fligtsMap.get(testAirport);

                    for (int j = 0; j < potentialAirp.size(); j++) {
                        if(potentialAirp.get(j).equals(arrAirport)){
                            resultList.add(listOfdeptAirports.get(i));
                        };
                    }
                }
                if (resultList.size()>0) {
                    System.out.println("To " + arrAirport + " You can go from " + resultList + ".");
                } else {
                    System.out.println("You'll never fly to "+ arrAirport +", look for a bike! Buahahahah!!!");
                }
            } else if (mode == 3) {
                Set<String> setAirports = fligtsMap.keySet();
                String[] arrayOfdeptAirports = setAirports.toArray(String[]::new);
                List<String> listOfdeptAirports = new ArrayList<String>(Arrays.asList(arrayOfdeptAirports));


                HashSet <String> resultList = new HashSet <>();
                for (int i = 0; i < listOfdeptAirports.size(); i++) {
                    List<String> potentialAirp = fligtsMap.get(listOfdeptAirports.get(i));

                    for (int j = 0; j < potentialAirp.size(); j++) {
                        if(potentialAirp.get(j).equals(arrAirport)){

                            for (int k = 0; k < listOfdeptAirports.size(); k++) {
                                List<String> potentialAirpTwo = fligtsMap.get(listOfdeptAirports.get(k));

                                for (int l = 0; l < potentialAirpTwo.size(); l++) {
                                    if(potentialAirpTwo.get(l).equals(listOfdeptAirports.get(i))){

                                        if (listOfdeptAirports.get(k).equals(depAirport)) {
                                            resultList.add(listOfdeptAirports.get(k) + " -> " + listOfdeptAirports.get(i) + " -> " + arrAirport);
                                        }}}}}}}

                if (resultList.size()>0) {
                    System.out.println("To " + arrAirport +" from "+depAirport+" You can arrive on following routes.");
                    resultList.forEach(System.out::println);
                } else {
                    System.out.println("There is no possible ways to arrive to "+arrAirport+" from "+ depAirport+".");
                }
            } else {
                System.out.println("Mode out of range, change to  1 / 2 / 3");
            }
        } else {
            System.out.println("something went wrong, correct data and try again.");
        }
    }
    public static HashMap<String, List<String>> createTestMap(){
        List<String> listOne = new ArrayList<>();
        listOne.add("Warszawa");
        listOne.add("Wroclaw");
        listOne.add("Krakow");
        listOne.add("Lodz");
        listOne.add("Bydgoszcz");
        listOne.add("Szczecin");

        List<String> listTwo = new ArrayList<>();
        listTwo.add("Modlin");
        listTwo.add("Poznan");
        listTwo.add("Katowice");
        listTwo.add("Gdansk");
        listTwo.add("Rzeszow");
        listTwo.add("ZielonaGora");

        List<String> listThree = new ArrayList<>();
        listThree.add("Warszawa");
        listThree.add("Modlin");
        listThree.add("Wroclaw");
        listThree.add("Poznan");
        listThree.add("Krakow");
        listThree.add("Katowice");

        List<String> listFour = new ArrayList<>();
        listFour.add("Lodz");
        listFour.add("Gdansk");
        listFour.add("Bydgoszcz");
        listFour.add("Rzeszow");
        listFour.add("Szczecin");
        listFour.add("ZielonaGora");

        List<String> listFive = new ArrayList<>();
        listFive.add("Warszawa");
        listFive.add("Modlin");
        listFive.add("Krakow");
        listFive.add("Katowice");
        listFive.add("Bydgoszcz");
        listFive.add("Rzeszow");

        List<String> listSix = new ArrayList<>();
        listSix.add("Wroclaw");
        listSix.add("Poznan");
        listSix.add("Lodz");
        listSix.add("Gdansk");
        listSix.add("Szczecin");
        listSix.add("ZielonaGora");

        List<String> listSevem = new ArrayList<>();
        listFive.add("Modlin");
        listFive.add("Wroclaw");
        listFive.add("Poznan");
        listFive.add("Krakow");
        listFive.add("Katowice");
        listFive.add("Lodz");
        listFive.add("Gdansk");
        listFive.add("Bydgoszcz");
        listFive.add("Rzeszow");
        listFive.add("Szczecin");
        listFive.add("ZielonaGora");

        List<String> listEight = new ArrayList<>();
        listFive.add("Warszawa");
        listFive.add("Modlin");
        listFive.add("Wroclaw");
        listFive.add("Poznan");
        listFive.add("Krakow");
        listFive.add("Katowice");
        listFive.add("Lodz");
        listFive.add("Gdansk");
        listFive.add("Bydgoszcz");
        listFive.add("Szczecin");
        listFive.add("ZielonaGora");

        HashMap<String, List<String>> testMap = new HashMap<>();
        testMap.put("Wroclaw", listOne);
        testMap.put("Warszawa", listTwo);
        testMap.put("Krakow", listThree);
        testMap.put("Katowice", listFour);
        testMap.put("Gdansk", listFive);
        testMap.put("Rzeszow", listSix);
        testMap.put("Lodz", listSevem);
        testMap.put("Poznan", listEight);

        return testMap;
    }
}
