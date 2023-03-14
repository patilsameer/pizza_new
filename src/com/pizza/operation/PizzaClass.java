package com.pizza.operation;
import com.pizza.base.*;;

public class PizzaClass implements Pizza {
    int size; // size 1 = small pizz 2 =medium pizza 3 =large pizza
    public PizzaClass(){
        size=1;
    }
    @Override
    public int getInventory() {
        return 1;
    }

    @Override
    public Crust selectCrust() {
        Crust c=new CrustType();
        return c;
    }

    @Override
    public Toppings selectToppings() {
        Toppings myToppings=new MyToppings();
        return myToppings;
    }

    @Override
    public int selectSize() {
       return size;
    }
    
}
