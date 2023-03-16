package com.pizza.test;
import org.junit.Test;

import com.pizza.base.Sides;
import com.pizza.base.Toppings;
import com.pizza.operation.CrustType;
import com.pizza.operation.MyToppings;
import com.pizza.base.Pizza;
import com.pizza.operation.PizzaClass;

import static org.junit.Assert.assertEquals;
public class PizzaTest {
    PizzaClass p;
   
    @Test
    public void pizzaName(){
        p= new PizzaClass();
        p.setPizzaName("Italian");
        assertEquals(p.getPizzaName(),"Italian");
    }
    @Test
    public void pizzaSize(){
        p= new PizzaClass();

        p.setSize(2);
        assertEquals(p.getSize(),2 );

    }

    @Test
    public void pizzaPrice(){
        p=new PizzaClass();
        p.setPizzaPrice(100);
        assertEquals(p.getPizzaPrice(), 100);

    }

}
