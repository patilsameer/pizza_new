package com.pizza.test;
import org.junit.Test;

import com.pizza.base.Sides;
import com.pizza.base.Toppings;
import com.pizza.operation.CrustInventory;
import com.pizza.operation.CrustType;
import com.pizza.operation.MySide;
import com.pizza.operation.MyToppings;

import static org.junit.Assert.assertEquals;
public class InventoryTest {
    
     @Test
    public void crustInventoryTest(){
        CrustType c=new CrustType();
        CrustInventory crustInventory=new CrustInventory();
        crustInventory.setCrust(c);
        crustInventory.setCount(10);
         assertEquals(crustInventory.getCrust(),c);
         assertEquals(crustInventory.getCount(), 10);
     }
    
    // @Test
    // public void toppingsTest(){
    //     Toppings t=new MyToppings();
            
    //     assertEquals(t.getAvailableInventory(), 1);
    // }

    // public void sidesTest(){
    //     Sides s=new MySide();
    //     assertEquals(s.getAvailableInventory(), 1);
    // }
}
