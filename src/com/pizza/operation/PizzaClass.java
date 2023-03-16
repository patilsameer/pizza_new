package com.pizza.operation;
import com.pizza.base.*;;

public class PizzaClass implements Pizza {
    int pizzaSize=1; // size 1 = small pizz 2 =medium pizza 3 =large pizza
    int price=1;
    public PizzaClass(){
        pizzaSize=1;
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


    @Override
    public int getPrice() {
        return price;
    }


    @Override
    public void setPrice(int price) {
      this.price=price;
    }
    
}
