package com.pizza.base;

import com.pizza.operation.InventoryException;

public interface Order {
    void verifyOrder();

    boolean addPizza(Pizza p) throws InventoryException;

    boolean addSide(Sides s) throws InventoryException;

    boolean removeSide(Sides s);

    boolean removePizza(Pizza p);

    boolean confirmOrder();

    Pizza getPizza(int index);
}
