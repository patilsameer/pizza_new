package com.pizza.operation;

import com.pizza.base.Sides;

public class MySide implements Sides {

    int sidePrice=1;
    int availableInventory=1;
    String sideName;

    
    @Override
    public int getAvailableInventory()  {
        return availableInventory;
        
    }

    @Override
    public void setAvailableInventory(int cnt) {
        availableInventory=cnt;
    }

    @Override
    public Sides getSide() {
        return new MySide();//think what to do?
    }
    
    public String getSideName(){
        return sideName;
    }

    public void setSideName(String name){
        this.sideName=name;
    }

    @Override
    public int getSidePrice() {
       return sidePrice;
    }

    public void setSidePrice(int price){
        this.sidePrice=price;
    }

    
}
