package com.pizza.operation;

import com.pizza.base.*;;

public class PizzaClass implements Pizza {
    int pizzaSize = 1; // size 1 = small pizz 2 =medium pizza 3 =large pizza
    int price = 1;
    String pizzaName = null;
    Crust crustType = null;
    Toppings myToppings = null;

    public void setPizzaName(String name) {
        this.pizzaName = name;
    }

    public String getPizzaName() {
        return this.pizzaName;
    }

    public String toString() {
        return "name = " + pizzaName + "size = " + pizzaSize + " price = " + price;
    }

    @Override
    public void setCrust(Crust c) {
        crustType = c;
    }

    @Override
    public String getCrustName() {
        return crustType.getCrustName();

    }

    public Crust getCrust() {
        return crustType;
    }

    @Override
    public int getSize() {
        return pizzaSize;
    }

    @Override
    public void setSize(int userSelectedSize) {
        pizzaSize = userSelectedSize;
    }

    @Override
    public int getPizzaPrice() {
        return price;
    }

    @Override
    public void setPizzaPrice(int price) {
        this.price = price;
    }

    @Override
    public Toppings getToppings() {
        return myToppings;
    }

    @Override
    public void setToppings(Toppings t) {
        myToppings = t;
        price += t.getPrice();
    }

    @Override
    public String getToppingName() {
        return myToppings.getToppingName();
    }

}
