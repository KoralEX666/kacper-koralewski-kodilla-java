package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class MovieStore {

    public static Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }


    public static void main(String[] args) {
        System.out.println("9.1 Maps/Stream Iteration");

        Map<String, List<String>> movieList = getMovies();

        List<List> listOfTitles = Collections.singletonList(movieList
                .entrySet()
                .stream()
                .flatMap(title -> title.getValue().stream())
                .collect(Collectors.toList()));

        var list = Arrays.asList(listOfTitles);
		Stream.iterate(0, n -> n + 1).limit(listOfTitles.size())
                .forEach(e -> System.out.println(listOfTitles.get(e)));

        System.out.println("Second option");

        String printTitles = Collections.singletonList(movieList
                .entrySet()
                .stream()
                .flatMap(title -> title.getValue().stream())
                .collect(Collectors.joining("! "))).toString();
                System.out.println(printTitles);
    }
}