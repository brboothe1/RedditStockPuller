package com.company;

public class Stock {
    // Get in the habit of making things `final` wherever possible.
    // Also make sure to use the least visible modifier. In this case, `private`.
    private final String ticker;
    private final String companyName;
    private final double price;

    //UPDATE 1: Removed marketOrder and limitOrder from Stock object Initiation

    public Stock(String ticker, String companyName, double price) {

        this.ticker = ticker;
        this.companyName = companyName;
        this.price = price;

    }

    public String toString(){
        return String.format ("The limit order price is %s.", price);
    }

}
