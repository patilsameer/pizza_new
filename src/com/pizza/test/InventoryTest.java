package com.pizza.test;
import junit.framework.*;
import org.junit.Test;

import com.pizza.base.Toppings;
import com.pizza.operation.CrustType;
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
}
