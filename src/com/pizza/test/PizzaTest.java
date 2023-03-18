package com.pizza.test;


import org.junit.Before;
import org.junit.Test;

import com.pizza.base.Crust;
import com.pizza.base.Pizza;
import com.pizza.base.Toppings;
import com.pizza.operation.CrustType;
import com.pizza.operation.InventoryException;
import com.pizza.operation.MyToppings;
import com.pizza.operation.PizzaClass;

import static org.junit.Assert.assertEquals;

public class PizzaTest {
   
    Pizza pizza;
    Crust crust;
    Toppings toppings;
    @Before
    public void setUpPizza()throws InventoryException{
        pizza=new PizzaClass();
        crust=new CrustType();
        pizza.setCrust(crust);
        toppings=new MyToppings();
        toppings.setPrice(100);
        toppings.setToppingsName("Extra Chees");
        pizza.setPizzaName("Italian");
        pizza.setPizzaPrice(100);
        pizza.setSize(1);
        pizza.setToppings(toppings);    
    }

    @Test
    public void pizzaTest()throws InventoryException{
        assertEquals(pizza.getCrustName(),crust.getCrustName());
        assertEquals(pizza.getCrust(),crust);
        assertEquals(pizza.getPizzaName(),"Italian");
        assertEquals(pizza.getPizzaPrice(),200);//pizza + toppings
        assertEquals(pizza.getSize(),1);
        assertEquals(pizza.getToppingName(),toppings.getToppingName());
    }
}
