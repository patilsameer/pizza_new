package com.pizza.operation;
import com.pizza.base.*;;

public class PizzaClass implements Pizza {
    int pizzaSize=1; // size 1 = small pizz 2 =medium pizza 3 =large pizza
    int price=1;
    String pizzaName;
    public void setPizzaName(String name){
        this.pizzaName=name;
    }

    public String getPizzaName(){
        return this.pizzaName;
    }

    public PizzaClass(){
        pizzaSize=1;
    }

    public String toString(){
        return "name = "+name+ "size = " + pizzaSize +" price = " + price ;
    }

    @Override
    public String selectCrust() throws InventoryException {
        Crust c=new CrustType();
        if(c.getAvailableInventory()>0)
            return c.getCrustName();
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
       return pizzaSize;
    }
    public void setSize(int userSelectedSize){
        pizzaSize = userSelectedSize;
    }


    @Override
    public int getPizzaPrice() {
        return price;
    }


    @Override
    public void setPizzaPrice(int price) {
      this.price=price;
    }
    
}
