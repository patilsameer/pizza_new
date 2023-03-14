package com.pizza.base;
public interface PizzaFactory {
     Pizza createPizza();
     int checkInventory();
     Order createOrder();
     Sides createSides();
    }
