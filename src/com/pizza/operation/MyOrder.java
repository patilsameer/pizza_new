package com.pizza.operation;

import java.util.ArrayList;

import javax.management.relation.RoleList;

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
        inventory=Inventory.getInventory();
        pizza =new ArrayList<>();
        side=new ArrayList<>();
        this.inventory=Inventory.getInventory();
    }

    public MyOrder(Inventory inventory){
        this.inventory=inventory;
    }
    public int getAmount(){
        return totalAmount;
        //return 100;
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

    public boolean isConfiremd(){
        return isConfirmed;
    }

    @Override
    public boolean confirmOrder() {
        isConfirmed=true;
        return true;
    }

    @Override
    public boolean addPizza(Pizza p) throws InventoryException{
            
                 pizza.add(p);
                 totalAmount+=p.getPizzaPrice();
                //  if(p.getToppings()!=null){
                //     totalAmount+=p.getToppings().getPrice();
                //  }

                 return true;
    }

    @Override
    public Pizza getPizza(int index)
    {
        Pizza p=pizza.get(index);
        return p;
    }

    @Override
    public boolean addSide(Sides s) {
        side.add(s);
        totalAmount+=s.getSidePrice();
        return true;
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
