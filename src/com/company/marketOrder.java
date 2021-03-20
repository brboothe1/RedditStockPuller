package com.company;

public class MarketOrder implements Order {

    //Change to file name
    private final Stock ticker;

    public MarketOrder(Stock ticker) {

        this.ticker = ticker;


    }

    public String toString(){
        return String.format("Executing market order on %s." , ticker);
    }


}
