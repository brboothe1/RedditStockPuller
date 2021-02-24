package com.company;

public class Stock {
    // Get in the habit of making things `final` wherever possible.
    // Also make sure to use the least visible modifier. In this case, `private`.
    private final String ticker;
    private final String companyName;
    private final double price;
    marketOrder marketOrder;
    limitOrder limitOrder;

    public Stock(String ticker, String companyName, double price, marketOrder marketOrder, limitOrder limitOrder) {

        this.ticker = ticker;
        this.companyName = companyName;
        this.price = price;
        this.marketOrder = marketOrder;
        this.limitOrder = limitOrder;

    }

}
