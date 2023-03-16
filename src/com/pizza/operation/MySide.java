package com.pizza.operation;

import com.pizza.base.Sides;

public class MySide implements Sides {

    int price=1;
    int availableInventory=1;
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
        return "MySide";
    }

    @Override
    public int getPrice() {
       return price;
    }

    public void setPrice(int price){
        this.price=price;
    }
}
