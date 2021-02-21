package com.company;

public class limitOrder extends Order {

    double limitOrder;

    public limitOrder(double limitOrder) {
        this.limitOrder = limitOrder;
    }

    public String toString() {
        return String.format ("The limit order price is %s.", limitOrder);
    }
}
