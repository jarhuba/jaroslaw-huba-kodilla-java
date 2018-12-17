package com.kodilla.good.patterns.challenges;

public class InformationServiceElectronicMail implements InformationService {

    @Override
    public void sendInformationSuccesfullPayment(User user) {
        System.out.println("Informacja dla " + user.getName() + " zapłacone!");
    }

    @Override
    public void sendInformationUnsuccesfullPayment(User user) {
        System.out.println("Informacja dla " + user.getName() + " nie zapłacone!");
    }
}
