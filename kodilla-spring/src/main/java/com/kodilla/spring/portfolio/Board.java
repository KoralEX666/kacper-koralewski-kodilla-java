package com.kodilla.spring.portfolio;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void check() {
        System.out.println("toDoList has: " + toDoList.taskSize() + " items.");
        System.out.println("inProgressList has: " + inProgressList.taskSize() + " items.");
        System.out.println("doneList: " + doneList.taskSize() + " items.");
    }
}
