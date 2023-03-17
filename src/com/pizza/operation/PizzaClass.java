package com.pizza.operation;
import com.pizza.base.*;;

public class PizzaClass implements Pizza {
    int pizzaSize=1; // size 1 = small pizz 2 =medium pizza 3 =large pizza
    int price=1;
    String pizzaName=null;
    Crust crustType;
    Toppings myToppings;
    public void setPizzaName(String name){
        this.pizzaName=name;
    }

    public String getPizzaName(){
        return this.pizzaName;
    }

    public String toString(){
        return "name = "+pizzaName+ "size = " + pizzaSize +" price = " + price ;
    }

    @Override
    public void setCrust(Crust c){
        crustType =c;
    }
    @Override
    public String getCrustName(){
        return crustType.getCrustName();

    }
   

    @Override
    public Toppings selectToppings(Toppings t)throws InventoryException {
         myToppings=t;
        if(myToppings.getAvailableInventory()>0)
            return myToppings;
        throw new InventoryException();
    }

    @Override
    public int getSize() {
       return pizzaSize;
    }
    @Override
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
