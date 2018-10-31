package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> desiredMap = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> ((user.getBirthDate().plusYears(20)).isBefore(LocalDate.now())))
                .filter(user -> user.getPublicatedPostsNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getIdentificationNumber, user -> user));

        String toDisplay = desiredMap.entrySet().stream()
                .map(entry -> entry.getValue())
                .map(ForumUser::toString)
                .collect(Collectors.joining("\nUSER: ", "USER: ", "\nEND of LIST !!"));

        System.out.println(toDisplay);
    }
}
