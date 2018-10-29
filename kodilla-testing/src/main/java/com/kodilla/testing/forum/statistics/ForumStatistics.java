package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentsPerPost;
    private Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public int getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames().size() > 0) {
            averagePostsPerUser = statistics.postCount() / statistics.usersNames().size();
        }
        if (statistics.usersNames().size() > 0) {
            averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        }
        if (statistics.postCount() > 0) {
            averageCommentsPerPost = statistics.commentsCount() / statistics.postCount();
        }
    }

    public String showStatistics() {
        String message = "Średnia liczba postów na użytkownika to: " + averagePostsPerUser + " (" + averageCommentsPerPost + "," + averageCommentsPerUser + ")";
        return message;
    }
}