package com.pizza.base;

import com.pizza.operation.InventoryException;

public interface Sides {
    Sides getSide() throws InventoryException;

    String getSideName();

    int getSidePrice();

    void setSidePrice(int price);

    void setSideName(String name);

}
