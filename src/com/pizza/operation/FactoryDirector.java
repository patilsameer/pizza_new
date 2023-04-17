package com.pizza.operation;

import com.pizza.base.Crust;
import com.pizza.base.Order;

public class FactoryDirector {
    Inventory inventory;
    Order myOrder;
    PizzaClass pizza;

    public FactoryDirector() {
        inventory = Inventory.getInventory();
    }

    public void addNewCrust(CrustInventory crust) {
        inventory.addCrustToInventory(crust);
    }

    public boolean isCrustAvailable(Crust c) {
        return inventory.checkCrustInventory(c);
    }

    public void addNewToppings(ToppingsInventory topping) {
        inventory.addToppingsToInventory(topping);
    }

}
