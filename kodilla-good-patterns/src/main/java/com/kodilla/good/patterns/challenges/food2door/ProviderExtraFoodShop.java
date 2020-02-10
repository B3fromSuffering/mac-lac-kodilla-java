package com.kodilla.good.patterns.challenges.food2door;

public class ProviderExtraFoodShop implements Provider {

    final String name = "ExtraFoodShop";

    @Override
    public boolean process(String productName, int productQuantity) {

        System.out.println("Przetwarzanie zamówienia...");
        System.out.println("Sprawdzanie dostepności produktów...");
        System.out.println("Kompletowanie zamówienia...");
        System.out.println("Zamówienie zrealizowane!");

        return true;
    }
}
