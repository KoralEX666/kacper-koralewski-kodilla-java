package com.kodilla.patterns.factory.tasks;


public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("The Shopping task", "Screens", 15);
            case PAINTING -> new PaintingTask("The truck paint job", "green", "truck");
            case DRIVING -> new DrivingTask("The route to cinema", "Cinema", "kayak");
            default -> null;
        };
    }
}
