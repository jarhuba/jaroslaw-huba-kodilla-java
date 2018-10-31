package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> listForumUsers = new ArrayList<>();

    public Forum() {
        this.listForumUsers.add(new ForumUser(1, "User1", 'F', LocalDate.of(2000,1,1), 33));
        this.listForumUsers.add(new ForumUser(2, "User2", 'F', LocalDate.of(1999,1,1), 333));
        this.listForumUsers.add(new ForumUser(3, "User3", 'M', LocalDate.of(2000,1,1), 10));
        this.listForumUsers.add(new ForumUser(4, "User4", 'F', LocalDate.of(1999,1,1), 3));
        this.listForumUsers.add(new ForumUser(5, "User5", 'M', LocalDate.of(1998,1,1), 7));
        this.listForumUsers.add(new ForumUser(6, "User6", 'F', LocalDate.of(1997,1,1), 55));
        this.listForumUsers.add(new ForumUser(7, "User7", 'M', LocalDate.of(1996,1,1), 38));
        this.listForumUsers.add(new ForumUser(8, "User8", 'F', LocalDate.of(1995,1,1), 14));
        this.listForumUsers.add(new ForumUser(9, "User9", 'M', LocalDate.of(1994,1,1), 11));
        this.listForumUsers.add(new ForumUser(10, "User10", 'F', LocalDate.of(1993,1,1), 41));
        this.listForumUsers.add(new ForumUser(11, "User11", 'M', LocalDate.of(1992,1,1), 0));
        this.listForumUsers.add(new ForumUser(12, "User12", 'F', LocalDate.of(1991,1,1), 15));
    }

    List<ForumUser> getUserList() {
        return new ArrayList<>(listForumUsers);
    }
}
