package com.pizza.operation;
import com.pizza.base.Toppings;;
public class MyToppings implements Toppings{

    int availableInventory=1;

    @Override
    public String getToppingName() {
        return "my topping name";
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
