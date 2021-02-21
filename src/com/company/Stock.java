package com.company;

public class Stock {
    String ticker;
    String companyName;
    double price;
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
