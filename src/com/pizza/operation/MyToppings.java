package com.pizza.operation;
import com.pizza.base.Toppings;;
public class MyToppings implements Toppings{

    @Override
    public String getTopping() {
        return "my topping name";
    }

}
