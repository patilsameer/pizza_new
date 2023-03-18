package com.pizza.operation;

import java.util.ArrayList;
import java.util.List;

import com.pizza.base.Crust;
import com.pizza.base.Sides;
import com.pizza.base.Toppings;

public class Inventory  {
   

    private List<CrustInventory> crustInventoryList;
    private List<SideInventory> sideInventoryList;
    private List<ToppingsInventory> toppingInventoryList;

    private static Inventory inventory=null;

    private Inventory(){
     
            crustInventoryList=new ArrayList<>();
            sideInventoryList=new ArrayList<>();
            toppingInventoryList=new ArrayList<>();    
        
    }

    public static Inventory getInventory(){

            if(inventory==null){
                inventory=new Inventory();
            }
            return inventory;
    }

    public void addSideToInventory(SideInventory side){
        sideInventoryList.add(side);
    }
    public void addCrustToInventory(CrustInventory crust){
        crustInventoryList.add(crust);
    }

    public void addToppingsToInventory(ToppingsInventory topping){
        toppingInventoryList.add(topping);
    }

    public boolean checkCrustInventory(Crust crust){
        
        for(CrustInventory c:crustInventoryList){
            if(c.getCrust().equals(crust)){
                int i= crustInventoryList.indexOf(c);
                if(crustInventoryList.get(i).count>1){
                    crustInventoryList.get(i).count--;
                    return true;
                }
            }
        }
            return false;
    }
    public boolean revertCrustInventory(Crust crust){
        for(CrustInventory c:crustInventoryList){
            if(c.getCrust().equals(crust)){
                int i= crustInventoryList.indexOf(c);
                    crustInventoryList.get(i).count++;
                    return true;
                }
            }
        
        return false;
    }
   
    public boolean checkToppingsInventory(Toppings topping){
        for(ToppingsInventory c:toppingInventoryList){
            if(c.getToppings().equals(topping)){
                int i= toppingInventoryList.indexOf(c);
                if(toppingInventoryList.get(i).count>1){
                    toppingInventoryList.get(i).count--;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean revertToppingsInventory(Toppings topping){
        for(ToppingsInventory c:toppingInventoryList){
            if(c.getToppings().equals(topping)){
                int i= toppingInventoryList.indexOf(c);
                    toppingInventoryList.get(i).count++;
                    return true;
                }
            }
        
        return false;
    }


    public boolean checkSidesInventory(Sides side){
        for(SideInventory c:sideInventoryList){
            if(c.getSide().equals(side)){
                int i= sideInventoryList.indexOf(c);
                if(sideInventoryList.get(i).count>1){
                    sideInventoryList.get(i).count--;
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean revertSidesInventory(SideInventory side){
        if(sideInventoryList.contains(side)){
            int i= sideInventoryList.indexOf(side);
               
                    sideInventoryList.get(i).count++;
                    return true;
                
        }
        return false;
    }
}
