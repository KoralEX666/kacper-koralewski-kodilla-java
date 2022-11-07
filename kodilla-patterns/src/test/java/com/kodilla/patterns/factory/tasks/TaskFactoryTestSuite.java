package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then

        assertEquals("The Shopping task", shoppingTask.getTaskName());
        System.out.println(shoppingTask.getTaskName() + " is execuded ? - " + shoppingTask.isTaskExecuted());
        assertEquals(false, shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        System.out.println(shoppingTask.getTaskName() + " is execuded ? - " + shoppingTask.isTaskExecuted());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }
    @Test
    void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then

        assertEquals("The truck paint job", paintingTask.getTaskName());
        System.out.println(paintingTask.getTaskName() + " is execuded ? - " + paintingTask.isTaskExecuted());
        assertEquals(false, paintingTask.isTaskExecuted());
        paintingTask.executeTask();
        System.out.println(paintingTask.getTaskName() + " is execuded ? - " + paintingTask.isTaskExecuted());
        assertEquals(true, paintingTask.isTaskExecuted());
    }
    @Test
    void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("The route to cinema", drivingTask.getTaskName());
        System.out.println(drivingTask.getTaskName() + " is execuded ? - " + drivingTask.isTaskExecuted());
        assertEquals(false, drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        System.out.println(drivingTask.getTaskName() + " is execuded ? - " + drivingTask.isTaskExecuted());
        assertEquals(true, drivingTask.isTaskExecuted());
    }
}
