package com.pizza.test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestRunner {

    public static void main(String [] args){
        Result result=JUnitCore.runClasses(InventoryTest.class);
        System.out.println(result.wasSuccessful());
    }
    
}
