package com.pizza.base;

import com.pizza.operation.InventoryException;

public interface Pizza{
    boolean setCrust(Crust c)throws InventoryException;
    String getCrustName() throws InventoryException;
    Crust getCrust();

    Toppings getToppings();
    boolean setToppings(Toppings t);
    String getToppingName();

    void setSize(int userSelectedSize);// 1=small  2=medium 3=large
    int getSize();//return size of pizza
   
    int getPizzaPrice();
    void setPizzaPrice(int price);
    String toString();
    String getPizzaName();
    void setPizzaName(String name);
}
