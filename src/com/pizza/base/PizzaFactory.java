package com.pizza.base;

import java.util.ArrayList;

public interface PizzaFactory{
     Pizza createPizza();
     Sides createSides();
     Crust createCrust();
     Toppings createToppings();
     Order createOrder(ArrayList<Pizza> p);
     Order createOrder(ArrayList<Pizza> p,ArrayList<Sides> s);
    }
