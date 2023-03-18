package com.pizza.test;

import com.pizza.base.Crust;
import com.pizza.base.Pizza;
import com.pizza.base.Sides;
import com.pizza.base.Toppings;
import com.pizza.operation.CrustInventory;
import com.pizza.operation.CrustType;
import com.pizza.operation.Inventory;
import com.pizza.operation.InventoryException;
import com.pizza.operation.MyOrder;
import com.pizza.operation.MySide;
import com.pizza.operation.MyToppings;
import com.pizza.operation.PizzaClass;
import com.pizza.operation.SideInventory;
import com.pizza.operation.ToppingsInventory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;

public class MyOrderTest {
    private CrustInventory crustInventory;
    private Crust crustType;
    private SideInventory sideInventory;
    private Sides mySide;
    private Toppings myToppings;
    private ToppingsInventory toppingsInventory;
    private Inventory inventory;//=Inventory.getInventory();
    private MyOrder myorder;
    private Pizza pizza;

    @Before
    public void setup(){
        inventory=Inventory.getInventory();

        crustInventory=new CrustInventory();
        crustType=new CrustType();
        crustType.setCrustName("Crust1");
        crustInventory.setCrust(crustType);
        crustInventory.setCount(10);
        inventory.addCrustToInventory(crustInventory);

        crustInventory=new CrustInventory();
        crustType=new CrustType();
        crustType.setCrustName("Crust2");
        crustInventory.setCrust(crustType);
        crustInventory.setCount(10);
        inventory.addCrustToInventory(crustInventory);
    }

    @Test
    public void myOrderTest()throws InventoryException{
        
        assertEquals(inventory.getCrustInventory(1).getCrust().getCrustName(), "Crust1");
        assertEquals(inventory.getCrustInventory(2).getCrust().getCrustName(), "Crust2");
    }
}
