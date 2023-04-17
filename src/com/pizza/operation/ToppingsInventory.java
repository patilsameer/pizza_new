package com.pizza.operation;

import com.pizza.base.Toppings;

public class ToppingsInventory {
    Toppings topping;
    int count;

    public Toppings getToppings() {
        return topping;
    }

    public void setToppings(Toppings topping) {
        this.topping = topping;
    }

    public int getCount() {
        return count;
    }

    public void setCoutn(int count) {
        this.count = count;
    }

}
