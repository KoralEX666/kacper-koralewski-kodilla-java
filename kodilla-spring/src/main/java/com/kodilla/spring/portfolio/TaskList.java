package com.kodilla.spring.portfolio;

import java.util.*;
import java.util.ArrayList;

public class TaskList {


    List< String > tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public int taskSize(){
        return tasks.size();
    }
    public void addToTaskList(String text){
        tasks.add(text);
    }
    public List<String> getTasks() {
        return tasks;
    }
}
