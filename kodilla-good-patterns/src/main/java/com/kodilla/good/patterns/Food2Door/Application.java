package com.kodilla.good.patterns.Food2Door;

public class Application {

    public static void main(String[] args) {
        InformationService informationService = new InformationService();

        Producer healthyShop = new Producer("HealthyShop") {
            @Override
            public void specificProcess() {
                System.out.println("Dodawanie do zewnętrznej bazy danych informacji o zamówieniu w HealthyShop");
            }
        };

        Producer simpleStore = new Producer("SimpleStore") {
            @Override
            public void specificProcess() {
            }
        };

        Product healthyShopMilk = new Product("Zielone mleko", 5.5, healthyShop);
        Product healthyShopJuice = new Product("Jabłko prosto z drzewa", 3.5, healthyShop);
        Product simpleStoreEggs = new Product("Jajka", 7, simpleStore);

        //(1)
        Order order = new Order();
        order.addProductToOrder(healthyShopMilk, 1);
        order.addProductToOrder(healthyShopJuice, 1);
        order.addProductToOrder(simpleStoreEggs, 4);

        //(2)
        boolean successHealthyShop = healthyShop.process(order);
        boolean successSimpleStore = simpleStore.process(order);

        //(3)
        if (successHealthyShop) {
            informationService.sendInformationSucces();
        } else {
            informationService.sendInformationFailure();
        }
        if (successSimpleStore) {
            informationService.sendInformationSucces();
        } else {
            informationService.sendInformationFailure();
        }

    }
}
