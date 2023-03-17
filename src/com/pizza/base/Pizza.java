package com.pizza.base;

import com.pizza.operation.InventoryException;

public interface Pizza{
    void setCrust(Crust c)throws InventoryException;
    //void setCrustName(String name) throws InventoryException;
    String getCrustName() throws InventoryException;
    Toppings selectToppings()throws InventoryException;
    void setSize(int userSelectedSize);// 1=small  2=medium 3=large
    int getSize();//return size of pizza
    int getPizzaPrice();
    void setPizzaPrice(int price);
    String toString();
    String getPizzaName();
    void setPizzaName(String name);
}
