package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int identificationNumber;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int publicatedPostsNumber;

    public ForumUser(final int identificationNumber, final String userName, final char sex, final LocalDate birthDate, final int publicatedPostsNumber) {
        this.identificationNumber = identificationNumber;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.publicatedPostsNumber = publicatedPostsNumber;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublicatedPostsNumber() {
        return publicatedPostsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identificationNumber=" + identificationNumber +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publicatedPostsNumber=" + publicatedPostsNumber +
                '}';
    }
}
