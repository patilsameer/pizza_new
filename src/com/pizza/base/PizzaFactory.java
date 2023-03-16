package com.pizza.base;
public interface PizzaFactory {
     Pizza createPizza();
     int checkInventory();
     Order createOrder(Pizza p);
     Order createOrder(Pizza p,Sides s);
     Sides createSides();
    }
