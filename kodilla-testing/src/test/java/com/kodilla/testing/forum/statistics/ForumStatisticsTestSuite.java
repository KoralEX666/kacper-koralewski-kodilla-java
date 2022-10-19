package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    @Mock
    private Statistics statistics;

    private List<String> generateListOfUsersNames(int usersNamesQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersNamesQuantity; n++) {
            String nextUser = new String("Name " + n);
            resultList.add(nextUser);
        }
        return resultList;
    }

    @BeforeEach
    public void beforeEachStartingValues() {
        //Given
        List<String> users = generateListOfUsersNames(150);
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.postsCount()).thenReturn(520);
        when(statistics.commentsCount()).thenReturn(760);
    }

    @Test
    @DisplayName("Test condition = number of post = 0")
    public void testCalculationWithPostNoZero(){
        //Given
        when(statistics.postsCount()).thenReturn(0);
        ForumStatistics expectedStatistic = new ForumStatistics(statistics);


        //When
        expectedStatistic.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0,expectedStatistic.getNumberOfPosts());
        System.out.println("Test condition = number of post = 0");
        expectedStatistic.showStatistics();
    }
    @Test
    @DisplayName("Test condition = number of post = 1000")
    public void testCalculationWithPostNoThousand(){
        //Given
        when(statistics.postsCount()).thenReturn(1000);
        ForumStatistics expectedStatistic = new ForumStatistics(statistics);


        //When
        expectedStatistic.calculateAdvStatistics(statistics);

        //Then
        assertEquals(1000,expectedStatistic.getNumberOfPosts());
        System.out.println("Test condition = number of post = 1000");
        expectedStatistic.showStatistics();
    }
    @Test
    @DisplayName("Test condition = number of comments = 0")
    public void testCalculationWithCommentsNoZero(){
        //Given
        when(statistics.commentsCount()).thenReturn(0);
        ForumStatistics expectedStatistic = new ForumStatistics(statistics);


        //When
        expectedStatistic.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0,expectedStatistic.getNumberOfComments());
        System.out.println("Test condition = number of comments = 0");
        expectedStatistic.showStatistics();
    }
    @Test
    @DisplayName("Test condition = number of comments < number of posts")
    public void testCalculationWithCommentsHigherAsPost(){
        //Given
        when(statistics.commentsCount()).thenReturn(150);
        when(statistics.postsCount()).thenReturn(300);
        ForumStatistics expectedStatistic = new ForumStatistics(statistics);


        //When
        expectedStatistic.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0.5,expectedStatistic.getAverageCommentsPerPost());
        System.out.println("Test condition = number of comments < number of posts");
        expectedStatistic.showStatistics();
    }
    @Test
    @DisplayName("Test condition = number of posts < number of comments")
    public void testCalculationWithPostHigherAsComments(){
        //Given
        when(statistics.postsCount()).thenReturn(150);
        when(statistics.commentsCount()).thenReturn(300);
        ForumStatistics expectedStatistic = new ForumStatistics(statistics);


        //When
        expectedStatistic.calculateAdvStatistics(statistics);

        //Then
        assertEquals(2,expectedStatistic.getAverageCommentsPerPost());
        System.out.println("Test condition = number of posts < number of comments");
        expectedStatistic.showStatistics();
    }
    @Test
    @DisplayName("Test condition = number of Users = 0")
    public void testCalculationWithNumberOfUsersZero(){
        //Given
        List<String> users = generateListOfUsersNames(0);
        when(statistics.usersNames()).thenReturn(users);
        ForumStatistics expectedStatistic = new ForumStatistics(statistics);


        //When
        expectedStatistic.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0,expectedStatistic.getNumberOfUsers());
        System.out.println("Test condition = number of Users = 0");
        expectedStatistic.showStatistics();
    }
    @Test
    @DisplayName("Test condition = number of Users = 1000")
    public void testCalculationWithNumberOfUsersThousand(){
        //Given
        List<String> users = generateListOfUsersNames(1000);
        when(statistics.usersNames()).thenReturn(users);
        ForumStatistics expectedStatistic = new ForumStatistics(statistics);


        //When
        expectedStatistic.calculateAdvStatistics(statistics);

        //Then
        assertEquals(1000,expectedStatistic.getNumberOfUsers());
        System.out.println("Test condition = number of Users = 1000");
        expectedStatistic.showStatistics();
    }

}
