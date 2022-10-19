package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int identifier;
    private final String username;
    private final char gender;
    private final LocalDate birthDate;
    private final int countedPosts;

    public ForumUser(int identifier, String username, char gender, LocalDate birthDate, int countedPosts) {
        this.identifier = identifier;
        this.username = username;
        this.gender = gender;
        this.birthDate = birthDate;
        this.countedPosts = countedPosts;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getCountedPosts() {
        return countedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identifier=" + identifier +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", countedPosts=" + countedPosts +
                '}';
    }
}
