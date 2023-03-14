package com.pizza.base;
public interface Pizza extends InventoryItem{
    Crust selectCrust();
    Toppings selectToppings();
    int selectSize();

}
