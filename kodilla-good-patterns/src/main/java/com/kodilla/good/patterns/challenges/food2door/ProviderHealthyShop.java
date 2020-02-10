package com.kodilla.good.patterns.challenges.food2door;

public class ProviderHealthyShop implements Provider{

    final String name = "ProviderHealthyShop";

    @Override
    public boolean process(String productName, int productQuantity) {

        System.out.println("Przetwarzanie zamówienia...");
        System.out.println("Sprawdzanie dostepności produktów...");
        System.out.println("Pakowanie zamówienia...");
        System.out.println("Zamówienie zrealizowane!");

        return true;
    }
}
