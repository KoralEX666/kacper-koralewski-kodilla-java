package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

        private final String taskName;
        private final String color;
        private final String whatToPaint;
        private boolean executed;

        public PaintingTask(String taskName, String color, String whatToPaint) {
            this.taskName = taskName;
            this.color = color;
            this.whatToPaint = whatToPaint;
            this.executed = false;
        }

        @Override
        public void executeTask() {
            executed = true;
            System.out.println("Printing task: " + taskName + " executed.");

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
