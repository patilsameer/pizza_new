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
    private Pizza pizza2;

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

        sideInventory=new SideInventory();
        mySide=new MySide();
        mySide.setSideName("Side1");
        mySide.setSidePrice(300);
        sideInventory.setSide(mySide);
        sideInventory.setCount(10);
        inventory.addSideToInventory(sideInventory);

        sideInventory=new SideInventory();
        mySide=new MySide();
        mySide.setSideName("Side2");
        mySide.setSidePrice(200);
        sideInventory.setSide(mySide);
        sideInventory.setCount(2);
        inventory.addSideToInventory(sideInventory);

        toppingsInventory=new ToppingsInventory();
        myToppings=new MyToppings();
        myToppings.setToppingsName("Topping1");
        myToppings.setPrice(100);
        toppingsInventory.setToppings(myToppings);
        toppingsInventory.setCoutn(10);
        inventory.addToppingsToInventory(toppingsInventory);

        toppingsInventory=new ToppingsInventory();
        myToppings=new MyToppings();
        myToppings.setToppingsName("Topping2");
        myToppings.setPrice(100);
        toppingsInventory.setToppings(myToppings);
        toppingsInventory.setCoutn(10);
        inventory.addToppingsToInventory(toppingsInventory);

    }

    @Test
    public void myInventorySetupTest()throws InventoryException{      
        assertEquals(inventory.getCrustInventory(1).getCrust().getCrustName(), "Crust1");
        assertEquals(inventory.getCrustInventory(2).getCrust().getCrustName(), "Crust2");
    
        assertEquals(inventory.getSideInventory(1).getSide().getSideName(),"Side1");
        assertEquals(inventory.getSideInventory(2).getSide().getSideName(),"Side2");
    
        assertEquals(inventory.getToppingInventory(1).getToppings().getToppingName(),"Topping1");
        assertEquals(inventory.getToppingInventory(2).getToppings().getToppingName(),"Topping2");
    }

    @Before
    public void myOrderSetup()throws InventoryException{
       // myorder =new MyOrder(inventory);
        myorder=new MyOrder();
        pizza = new PizzaClass();
        pizza.setPizzaName("MyPizza");
        pizza.setPizzaPrice(200);
        pizza.setSize(1);

        pizza2=new PizzaClass();
        pizza2.setPizzaName("MyPizza2");
        pizza2.setPizzaPrice(300);
        pizza2.setSize(1);
       // mySide=inventory.getSideInventory(1).getSide();
        

       //boolean result= pizza.setToppings(inventory.getToppingInventory(1).getToppings());
      // pizza.setToppings(inventory.getToppingInventory(1).getToppings());
    }
    @Test
    public void myOrderTest()throws InventoryException{
        //assertEquals(pizza.getToppingName(), "Topping1");
        //assertEquals(myorder.addSide(mySide), true);
        assertEquals(myorder.addSide(inventory.getSideInventory(1).getSide()), true);
        assertEquals(myorder.addSide(inventory.getSideInventory(2).getSide()), true);


        assertEquals(pizza.setToppings(inventory.getToppingInventory(1).getToppings()),true);
        assertEquals(pizza.setCrust(inventory.getCrustInventory(1).getCrust()), true);
        assertEquals(pizza.getCrustName(), "Crust1");
        assertEquals(pizza.getToppingName(),"Topping1");
        assertEquals(myorder.addPizza(pizza),true);
        assertEquals(pizza.getPizzaPrice(),300);


        assertEquals(pizza2.setToppings(inventory.getToppingInventory(2).getToppings()),true);
        assertEquals(pizza2.setCrust(inventory.getCrustInventory(2).getCrust()), true);
        assertEquals(pizza2.getCrustName(), "Crust2");
       assertEquals(pizza2.getToppingName(),"Topping2");
       assertEquals(myorder.addPizza(pizza2),true);
       assertEquals(pizza2.getPizzaPrice(),400);
       
       
       assertEquals(myorder.getAmount(),1200);

    }

}
