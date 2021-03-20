package com.company;

public class Stock {

    private final String ticker;
    private final String companyName;
    private final double price;

    public Stock(String ticker, String companyName, double price) {

        this.ticker = ticker;
        this.companyName = companyName;
        this.price = price;

    }

    public String toString() {return String.format ("%s (%s, Purchase Price: $%.2f)" , ticker, companyName, price);

    }


}
