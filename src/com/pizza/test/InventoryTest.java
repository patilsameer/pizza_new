package com.pizza.test;
import junit.framework.*;
import org.junit.Test;

import com.pizza.operation.CrustType;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
public class InventoryTest {
    
    @Test
    public void crustInventoryTest(){
        CrustType c=new CrustType();
        assertEquals(c.getAvailableInventory(),1);
    }
    
}
