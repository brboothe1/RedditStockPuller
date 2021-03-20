package com.company;

// change to file name
public class LimitOrder implements Order {

    private double value;
    private final Stock ticker;

    public LimitOrder(Stock ticker, double value) {

        this.value = value;
        this.ticker = ticker;


    }

    public String toString(){

        return String.format("Setting limit order on %s for $%s.", ticker, value);

    }

}
