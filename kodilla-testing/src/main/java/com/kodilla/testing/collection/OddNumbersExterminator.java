package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    private Integer number;
    private List<Integer> numbers;


    public OddNumbersExterminator(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return this.number;
    }

    public static List<Integer> exterminate(List<Integer> numbers){
        int restCheck;
        List<Integer> finnalList = new ArrayList<>();

        if (numbers.size()>0){
            for (Integer testNumber: numbers) {
                if (testNumber%2==0){
                    finnalList.add(testNumber);
                }
            }
        } else {
            System.out.println("Empty list");
        }
        return finnalList;
    }

}
