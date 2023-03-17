package com.pizza.operation;

import java.util.ArrayList;
import com.pizza.base.Crust;
import com.pizza.base.Sides;
import com.pizza.base.Toppings;

public class Inventory  {
    
    private ArrayList<Crust> crustList;
    private ArrayList<Sides> sideList;
    private ArrayList<Toppings> toppingList;

    private static Inventory inventory=null;

    private Inventory(){
     
            crustList=new ArrayList<>();
            sideList=new ArrayList<>();
            toppingList=new ArrayList<>();    
        
    }

    public static Inventory getInventory(){

            if(inventory.equals(null)){
                inventory=new Inventory();
            }
            return inventory;
    }

    public void addSideToInventory(Sides side){
        sideList.add(side);
    }
    public void addCrustToInventory(Crust crust){
        crustList.add(crust);
    }

    public void addToppingsToInventory(Toppings topping){
        toppingList.add(topping);
    }
}
