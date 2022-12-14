package com.kodilla.spring.portfolio;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testEmptyBoardCreation(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When & Then
        board.check();

    }
    @Test
    void testTaskAdd(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addToTaskList("something");

        board.getInProgressList().addToTaskList("maybe something more");

        board.getDoneList().addToTaskList("or another thing");

        //Then
        board.check();
        System.out.println("ToDoList has those elements " + board.getToDoList().getTasks());
        assertEquals(1, board.getToDoList().taskSize());
        System.out.println("InProgressList has those elements " + board.getInProgressList().getTasks());
        assertEquals(1, board.getInProgressList().taskSize());
        System.out.println("DoneList has those elements " + board.getDoneList().getTasks());
        assertEquals(1, board.getDoneList().taskSize());
    }

}
