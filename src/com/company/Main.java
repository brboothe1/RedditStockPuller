package com.company;

public class Main {

    public static void main(String[] args) {


        // This feels backwards. Stock is the data model. Order is the action. Order should take in a Stock
        // as a dependency not the other way around.

        //UPDATE 1: Flipped the Orders and Stock initiation for general idea of look.

        Stock gme = new Stock("GME", "Gamestop", 56.34);

        marketOrder gmeMarkerOrder = new marketOrder(); // This should be something like `new MarketOrder(gme)`.
        limitOrder gmeLimitOrder = new limitOrder(84.24); // This should be something like `new LimitOrder(gme, 84.24)`.

    }
}
