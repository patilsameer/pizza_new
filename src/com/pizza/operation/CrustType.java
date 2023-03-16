package com.pizza.operation;
import com.pizza.base.Crust;
public class CrustType implements Crust{

    public int availableInventory=1;
    public String crustName="default";

   

    @Override
    public String getCrustName() {
     return crustName;
    }


    public int getAvailableInventory() {
        return availableInventory;
    }


    public void setAvailableInventory(int availableInventory) {
        this.availableInventory = availableInventory;
    }

}
