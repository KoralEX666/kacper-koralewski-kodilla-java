package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Alan", 'M', LocalDate.of(1946,2,14), 309));
        userList.add(new ForumUser(2, "Bruce", 'M', LocalDate.of(1955,3,19), 190));
        userList.add(new ForumUser(3, "Michael", 'M', LocalDate.of(1940,10,19), 458));
        userList.add(new ForumUser(180, "Andrew", 'M', LocalDate.of(1968,1,5), 180));
        userList.add(new ForumUser(250, "Jessica", 'F', LocalDate.of(1964,9,30), 7));
        userList.add(new ForumUser(219, "Monica", 'F', LocalDate.of(1955,3,19), 358));
        userList.add(new ForumUser(208, "Natalie", 'F', LocalDate.of(1981,6,19), 167));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
