package com.company;

public interface Order {

    //At the minimum, an order must have a reference to the Stock it is supposed to fulfill right?

    //UPDATE question - How would you implement this?
    // Stock isn't a constant, it changes with each instantiation. (Can't write Stock ticker;)
    // Using market/limitOrder methods would need them to be used in all implementations of Order interface

}
