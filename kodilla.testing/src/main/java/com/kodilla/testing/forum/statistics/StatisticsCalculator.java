package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if(usersQuantity > 0) {
            averagePostsPerUser = postsQuantity / usersQuantity;
            averageCommentsPerUser = commentsQuantity / usersQuantity;
        }else{
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        }
        if (postsQuantity > 0) {
            averageCommentsPerPost = commentsQuantity / postsQuantity;
        }else{
            averageCommentsPerPost = 0;
        }
    }
    public String showStatistics(){
        return "STATISTICS" + "/nUsers: " + usersQuantity + "/nPosts: " + postsQuantity + "/nAverage number of posts per user: " +
                averagePostsPerUser + "/nAverage number of comments per user: " + averageCommentsPerUser +
                "/nAverage number of comments per post: " + averageCommentsPerPost;
    }
}
