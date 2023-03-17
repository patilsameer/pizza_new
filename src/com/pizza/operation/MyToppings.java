package com.pizza.operation;
import com.pizza.base.Toppings;;
public class MyToppings implements Toppings{

    int availableInventory=1;
    String toppingsName;

    @Override
    public void setToppingsName(String name){
        toppingsName=name;
    }
    @Override
    public String getToppingName() {
        return toppingsName;
    }

    @Override
    public int getAvailableInventory() {
        return availableInventory;
    }

    @Override
    public void setAvailableInventory(int cnt) {
       availableInventory=cnt;
    }

}
