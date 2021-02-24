package com.company;

public class marketOrder implements Order {

    // Why does market order have a value? Isn't it just entirely depend on whatever the current market value is?
    // In other words, making a market order does not require user to input a value.


    //UPDATE 1: Changed marketOrder from an input to a currentStockPrice value (might be redundant)

    double currentStockPrice;
    double marketOrder = currentStockPrice;

    public marketOrder() {


    }

}
