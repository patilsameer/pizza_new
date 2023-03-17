package com.pizza.test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.pizza.operation.PizzaClass;
public class TestRunner {

    public static void main(String [] args){
        Result result=JUnitCore.runClasses(InventoryTest.class);
        System.out.println(result.wasSuccessful());
        //Result result2=JUnitCore.runClasses(PizzaTest.class);
        //System.out.println(result2.wasSuccessful());
    }
    
}
