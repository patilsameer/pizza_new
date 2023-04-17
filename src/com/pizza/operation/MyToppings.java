package com.pizza.operation;

import com.pizza.base.Toppings;;

public class MyToppings implements Toppings {

    String toppingsName;
    int price;

    @Override
    public void setToppingsName(String name) {
        toppingsName = name;
    }

    @Override
    public String getToppingName() {
        return toppingsName;
    };

    public void setPrice(int amt) {
        price = amt;
    }

    public int getPrice() {
        return price;
    }

}
