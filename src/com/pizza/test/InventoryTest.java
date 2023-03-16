package com.pizza.test;
import junit.framework.*;
import org.junit.Test;

import com.pizza.base.Sides;
import com.pizza.base.Toppings;
import com.pizza.operation.CrustType;
import com.pizza.operation.MySide;
import com.pizza.operation.MyToppings;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
public class InventoryTest {
    
    @Test
    public void crustInventoryTest(){
        CrustType c=new CrustType();
        assertEquals(c.getAvailableInventory(),1);
    }
    
    @Test
    public void toppingsTest(){
        Toppings t=new MyToppings();
            
        assertEquals(t.getAvailableInventory(), 1);
    }

    public void sidesTest(){
        Sides s=new MySide();
        assertEquals(s.getAvailableInventory(), 1);
    }
}
