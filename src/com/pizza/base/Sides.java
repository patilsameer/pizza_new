package com.pizza.base;

import com.pizza.operation.InventoryException;

public interface Sides extends InventoryItem{
    Sides getSide()throws InventoryException;
    String getSideName();
    int getPrice();
    void setPrice(int price);
    
}
