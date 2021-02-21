package com.company;

public class marketOrder extends Order {

    double marketOrder;

    public marketOrder(double marketOrder) {


        this.marketOrder = marketOrder;
    }

    public String toString(){

        return String.format("The market order price is %s" , marketOrder);
    }
}
