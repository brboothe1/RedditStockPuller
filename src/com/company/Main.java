package com.company;

public class Main {

    public static void main(String[] args) {

        marketOrder gmeMarkerOrder = new marketOrder(42.75);
        limitOrder gmeLimitOrder = new limitOrder(84.24);

        // This feels backwards. Stock is the data model. Order is the action. Order should take in a Stock
        // as a dependency not the other way around.
        Stock gme = new Stock("GME", "Gamestop", 56.34, gmeMarkerOrder, gmeLimitOrder);

        System.out.println(gme.ticker);
        System.out.println(gme.companyName);
        System.out.println(gme.price);
        System.out.println(gme.marketOrder);
        System.out.println(gme.limitOrder);

    }
}
