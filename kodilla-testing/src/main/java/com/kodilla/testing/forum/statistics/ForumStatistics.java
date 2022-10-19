package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (numberOfUsers !=0) {
            averagePostsPerUser = (double) numberOfPosts / numberOfUsers;
            averageCommentsPerUser = (double) numberOfComments / numberOfUsers;
        }else {
            averagePostsPerUser=0;
            averageCommentsPerUser=0;
        }
        if(numberOfPosts!=0) {
            averageCommentsPerPost = (double) numberOfComments / numberOfPosts;
        }else {
            averageCommentsPerPost=0;
        }
    }

    public void showStatistics(){
        System.out.println("NumberOfUsers:"+numberOfUsers);
        System.out.println("NumberOfPosts:"+numberOfPosts);
        System.out.println("NumberOfComments:"+numberOfComments);
        System.out.println("AvrPosts/User:"+averagePostsPerUser);
        System.out.println("AvrComments/User:"+averageCommentsPerUser);
        System.out.println("AvrComments/Post:"+averageCommentsPerPost);
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }


}
