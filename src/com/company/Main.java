package com.company;

public class Main {

    public static void main(String[] args) {

        Stock GME = new Stock("GME", "GameStop", 150.24);

        Order GMEMarketOrder = new MarketOrder(GME);
        Order GMELimitOrder = new LimitOrder(GME, 92.24);

        System.out.println(GMEMarketOrder);
        System.out.println(GMELimitOrder);

    }
}
