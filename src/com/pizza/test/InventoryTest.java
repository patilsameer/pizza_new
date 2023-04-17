package com.pizza.test;

import org.junit.Test;
import com.pizza.base.Crust;
import com.pizza.base.Sides;
import com.pizza.base.Toppings;
import com.pizza.operation.CrustInventory;
import com.pizza.operation.CrustType;
import com.pizza.operation.Inventory;
import com.pizza.operation.MySide;
import com.pizza.operation.MyToppings;
import com.pizza.operation.SideInventory;
import com.pizza.operation.ToppingsInventory;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;

public class InventoryTest {
    private CrustInventory crustInventory;
    private Crust crustType;
    private SideInventory sideInventory;
    private Sides mySide;
    private Toppings myToppings;
    private ToppingsInventory toppingsInventory;
    private Inventory inventory;

    @Before
    public void setUpforCrust() {
        crustInventory = new CrustInventory();
        crustType = new CrustType();
        crustType.setCrustName("New Crust");
        crustInventory.setCrust(crustType);
        crustInventory.setCount(10);
        // inventory.addCrustToInventory(crustInventory);
    }

    @Test
    public void crustInventoryTest() {
        assertEquals(crustInventory.getCrust().getCrustName(), crustType.getCrustName());
        assertEquals(crustInventory.getCrust(), crustType);
        assertEquals(crustInventory.getCount(), 10);
    }

    @Before
    public void setUpforSide() {
        sideInventory = new SideInventory();
        mySide = new MySide();
        mySide.setSideName("nuggets");
        mySide.setSidePrice(100);
        sideInventory.setSide(mySide);
        sideInventory.setCount(10);
        // inventory.addSideToInventory(sideInventory);
    }

    @Test
    public void sideInventoryTest() {
        assertEquals(sideInventory.getSide().getSideName(), mySide.getSideName());
        assertEquals(sideInventory.getCount(), 10);
        assertEquals(sideInventory.getSide().getSidePrice(), 100);
        assertEquals(sideInventory.getSide().getSidePrice(), mySide.getSidePrice());
    }

    @Before
    public void setUpforToppings() {
        toppingsInventory = new ToppingsInventory();
        myToppings = new MyToppings();
        myToppings.setToppingsName("Extra Chees");
        myToppings.setPrice(100);
        toppingsInventory.setToppings(myToppings);
        toppingsInventory.setCoutn(10);
        // inventory.addToppingsToInventory(toppingsInventory);
    }

    @Test
    public void toppingInventoryTest() {
        assertEquals(toppingsInventory.getToppings().getToppingName(), myToppings.getToppingName());
        assertEquals(toppingsInventory.getCount(), 10);
        assertEquals(toppingsInventory.getToppings().getPrice(), myToppings.getPrice());
    }

    // @Before
    // public void setInventory()
    // {
    // inventory=Inventory.getInventory();
    // }

    @Test
    public void inventoryTest() {
        inventory = Inventory.getInventory();
        assertNotEquals(inventory, null);
        inventory.addCrustToInventory(crustInventory);
        inventory.addSideToInventory(sideInventory);
        inventory.addToppingsToInventory(toppingsInventory);

        assertEquals(inventory.checkCrustInventory(crustType), true);
        assertEquals(inventory.checkSidesInventory(mySide), true);
        assertEquals(inventory.checkToppingsInventory(myToppings), true);
    }
}
