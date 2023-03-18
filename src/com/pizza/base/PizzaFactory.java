package com.pizza.base;


public interface PizzaFactory{
     Pizza createPizza();
     Sides createSides();
     Crust createCrust();
     Toppings createToppings();
     Order editOrder(Order order,InventoryItem inventoryItem);
     //Order createOrder(Pizza p,Side s);
    }
