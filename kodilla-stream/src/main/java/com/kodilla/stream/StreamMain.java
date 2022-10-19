package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.*;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        //zadanie 7.1
        System.out.println("Zadanie 7.1 \n");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String testText = "Some sample text";
        poemBeautifier.beautify("ABC", (textTOBeautify)->textTOBeautify + " " +  testText);
        poemBeautifier.beautify("ABC", (textTOBeautify)->testText + " " +  textTOBeautify);
        poemBeautifier.beautify("ABC", (textTOBeautify)->textTOBeautify  + " " +  testText  + " " +  textTOBeautify);
        poemBeautifier.beautify("ABC", (textTOBeautify)->testText.toUpperCase());
        poemBeautifier.beautify("ABC", (textTOBeautify)->testText.toLowerCase());
        poemBeautifier.beautify("ABC", (textTOBeautify)->testText+"!!!");
        poemBeautifier.beautify("ABC", (textTOBeautify)->testText+"???");

        //zadanie 7.3
        System.out.println("Zadanie 7.3 \n");

        Forum forumUserList = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forumUserList.getUserList().stream()
                .filter(forumUser -> forumUser.getGender()=='M')
                .filter(forumUser -> (2022 - forumUser.getBirthDate().getYear())>=20)
                .filter(forumUser -> forumUser.getCountedPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getIdentifier, forumUser -> forumUser));

        System.out.println("Map have " + theResultMapOfUsers.size() + "  elements.)");
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }
}