package com.company;

public class limitOrder extends Order {

    // Naming is incredibly important in engineering. The best type of documentation is self-documenting code.
    // I would name this value or something like that.
    double limitOrder;

    public limitOrder(double limitOrder) {
        this.limitOrder = limitOrder;
    }

    public String toString() {
        return String.format ("The limit order price is %s.", limitOrder);
    }
}
