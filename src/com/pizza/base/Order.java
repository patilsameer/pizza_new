package com.pizza.base;


public interface Order{
    void verifyOrder();
    boolean addPizza(Pizza p);
    boolean addSide(Sides s);
    boolean removeSide(Sides s);
    boolean removePizza(Pizza p);
    boolean confirmOrder();
}
