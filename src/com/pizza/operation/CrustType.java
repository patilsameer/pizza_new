package com.pizza.operation;
import com.pizza.base.Crust;
public class CrustType implements Crust{

    public String crustName="default";
    
    
    private CrustType(){}
   
    @Override
    public void setCrustName(String name){
        crustName=name;
    }
    @Override
    public String getCrustName() {
     return crustName;
    }



}
