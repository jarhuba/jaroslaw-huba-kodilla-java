package com.kodilla.good.patterns.food2door;

public class Application {

    public static void main(String[] args) {

        InformationService informationService = new InformationService();
        OrderService orderService = new OrderService(informationService);

        Producer healthyShop = new HealthyShop();
        Producer extraFoodShop = new ExtraFoodShop();
        Producer glutenFreeShop = new GlutenFreeShop();

        Product healthyShopMilk = new Product("Mleko krowie", 5.5, healthyShop);
        Product healthyShopJuice = new Product("Jabłko EKO", 3.5, healthyShop);
        Product healthyShopEggs = new Product("Jajka", 7, healthyShop);

        Product extraFoodShopMilk = new Product("Mleko kozie", 5.9, extraFoodShop);
        Product extraFoodShopJuice = new Product("Jabłko BIO", 3.2, extraFoodShop);
        Product extraFoodShopEggs = new Product("Jajka", 7.5, extraFoodShop);

        Product glutenFreeShopMilk = new Product("Zielone mleko", 5.1, glutenFreeShop);
        Product glutenFreeShopJuice = new Product("Jabłko prosto z drzewa", 3.1, glutenFreeShop);
        Product glutenFreeShopEggs = new Product("Jajka", 8.5, glutenFreeShop);

        Order order = new Order();
        order.addProductToOrder(healthyShopMilk, 20);
        order.addProductToOrder(healthyShopJuice, 1);
        order.addProductToOrder(healthyShopEggs, 10);
        order.addProductToOrder(extraFoodShopMilk, 1);
        order.addProductToOrder(extraFoodShopJuice, 1);
        order.addProductToOrder(extraFoodShopEggs, 10);
        order.addProductToOrder(glutenFreeShopMilk, 1);
        order.addProductToOrder(glutenFreeShopJuice, 1);
        order.addProductToOrder(glutenFreeShopEggs, 10);

        orderService.processOrderForSupplier(order);
    }
}
