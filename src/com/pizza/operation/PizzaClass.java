package com.pizza.operation;
import com.pizza.base.*;;

public class PizzaClass implements Pizza {
    int pizzasize; // size 1 = small pizz 2 =medium pizza 3 =large pizza
    public PizzaClass(){
        pizzasize=1;
    }
    

    @Override
    public String selectCrust() throws InventoryException {
        Crust c=new CrustType();
        if(c.getAvailableInventory()>0)
            return c.crustName();
        throw new InventoryException();
    }

    @Override
    public Toppings selectToppings()throws InventoryException {
        Toppings myToppings=new MyToppings();
        if(myToppings.getAvailableInventory()>0)
            return myToppings;
        throw new InventoryException();
    }

    @Override
    public int getSize() {
       return pizzasize;
    }
    public void setSize(int userSelectedSize){
        pizzaSize = userSelectedSize;
    }
    
}
