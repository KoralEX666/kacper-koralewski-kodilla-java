package com.kodilla.patterns.factory.tasks;

public class DrivingTask  implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean executed;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.executed = false;
    }

    @Override
    public void executeTask() {
        executed = true;
        System.out.println("Driving task: " + taskName + " executed.");

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return executed;
    }
}
