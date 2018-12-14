package com.kodilla.good.patterns.unit13;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Car rented for " + user.getSurname());
    }
}
