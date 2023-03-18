package com.pizza.test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


public class TestRunner {

    public static void main(String [] args){
        Result result=JUnitCore.runClasses(InventoryTest.class);
        System.out.println(result.wasSuccessful());
        Result result1=JUnitCore.runClasses(PizzaTest.class);
        System.out.println(result1.wasSuccessful());
     }
    
}
