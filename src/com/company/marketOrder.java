package com.company;

public class marketOrder extends Order {

    // Why does market order have a value? Isn't it just entirely depend on whatever the current market value is?
    // In other words, making a market order does not require user to input a value.
    double marketOrder;

    public marketOrder(double marketOrder) {


        this.marketOrder = marketOrder;
    }

    public String toString(){

        return String.format("The market order price is %s" , marketOrder);
    }
}
