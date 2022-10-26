package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.config.Task;

import java.util.List;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("todolist")
    TaskList taskList;
    Board board;

    @Bean(name = "todolist")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }

    @Bean(name = "newBoard")
    @Scope("prototype")
    public Board getBoard() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList todo = (TaskList) context.getBean("todolist");
        TaskList inPr = (TaskList) context.getBean("inProgressList");
        TaskList done = (TaskList) context.getBean("doneList");

        return new Board(todo, inPr, done);
    }





}
