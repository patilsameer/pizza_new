package com.pizza.test;
import org.junit.Test;

import com.pizza.base.Crust;
import com.pizza.base.Sides;
import com.pizza.base.Toppings;
import com.pizza.operation.CrustInventory;
import com.pizza.operation.CrustType;
import com.pizza.operation.MySide;
import com.pizza.operation.MyToppings;
import com.pizza.operation.SideInventory;

import org.junit.Rule;


import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class InventoryTest {
    private CrustInventory crustInventory;
    private Crust crustType;
    private SideInventory sideInventory;
    private Sides mySide;
    @Before
     public void setUpforCrust(){
        crustInventory=new CrustInventory();
        crustType=new CrustType();
        crustType.setCrustName("New Crust");
        crustInventory.setCrust(crustType);
        crustInventory.setCount(10);
     }
    
    @Test
    public void crustInventoryTest(){   
        assertEquals(crustInventory.getCrust().getCrustName(), crustType.getCrustName());
        assertEquals(crustInventory.getCrust(),crustType);
        assertEquals(crustInventory.getCount(), 10);
     }   

     @Before
     public void setUpforSide(){
        sideInventory=new SideInventory();
        mySide=new MySide();
        mySide.setSideName("nuggets");
        mySide.setSidePrice(100);
        sideInventory.setSide(mySide);
        sideInventory.setCount(10);
    }

    @Test
    public void sideInventoryTest(){
        assertEquals(sideInventory.getSide().getSideName(), mySide.getSideName());
        assertEquals(sideInventory.getCount(),10);
        assertEquals(sideInventory.getSide().getSidePrice(), 100);
    }
}
