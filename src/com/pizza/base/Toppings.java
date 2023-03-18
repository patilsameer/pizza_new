package com.pizza.base;

public interface Toppings extends InventoryItem{
    String getToppingName();
    void setToppingsName(String name);
    int getPrice();
    void setPrice(int price);
   
}
