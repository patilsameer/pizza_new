package com.pizza.operation;

import com.pizza.base.Crust;

public class CrustInventory {
    
    Crust crust;
    int count;
    public Crust getCrust(){
        return crust;
    }
    public void setCrust(Crust c){
        crust=c;
    }

    public int getCount()
    {
        return count;
    }
    public void setCount(int number){
        count=number;
    }
}
