package com.pizza.operation;

import java.util.ArrayList;

import com.pizza.base.Order;
import com.pizza.base.Pizza;
import com.pizza.base.Sides;

public class MyOrder implements Order {
    int totalAmount=0;
    ArrayList<Pizza> pizza;
    ArrayList<Sides> side;
    boolean isConfirmed;
    Inventory inventory;
    
    public MyOrder(){
    }
    @Override
    public void verifyOrder() {
        for (Pizza pizza : pizza) {
            System.out.println(pizza.toString());
        }
        for (Sides side : side) {
            System.out.println(side.toString());
        }
        System.out.println("Total Amount="+totalAmount);
    }

    @Override
    public boolean confirmOrder() {
        isConfirmed=true;
        return true;
    }

    @Override
    public boolean addPizza(Pizza p) throws InventoryException{
        if(inventory.checkCrustInventory(p.getCrust()) && inventory.checkToppingsInventory(p.getToppings())){
            pizza.add(p);
            totalAmount+=p.getPizzaPrice()+p.getToppings().getPrice();
            return true;
        }
        throw new InventoryException();
       
    }

    @Override
    public boolean addSide(Sides s)throws InventoryException {
       if(inventory.checkSidesInventory(s)){
        side.add(s);  
        totalAmount+=s.getSidePrice();
        return true;

       }
       throw new InventoryException();
    }

    @Override
    public boolean removeSide(Sides s) {
        side.remove(s);
        totalAmount-=s.getSidePrice();
        return true;
    }

    @Override
    public boolean removePizza(Pizza p){
        inventory.revertCrustInventory(p.getCrust());
        inventory.revertToppingsInventory(p.getToppings());
        pizza.remove(p);
        totalAmount-=p.getPizzaPrice();
        return true;
    }
   
        
    
    
}
