package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    int averagePostsPerUser;
    int averageCommentsPerUser;
    int averageCommentsPerPost;
    Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames().size() > 0) {
            this.averagePostsPerUser = statistics.postCount() / statistics.usersNames().size();
        }
        if (statistics.usersNames().size() > 0) {
            this.averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        }
        if (statistics.postCount() > 0) {
            this.averageCommentsPerPost = statistics.commentsCount() / statistics.postCount();
        }
    }


    public void showStatistics() {
        // TODO
    }
}