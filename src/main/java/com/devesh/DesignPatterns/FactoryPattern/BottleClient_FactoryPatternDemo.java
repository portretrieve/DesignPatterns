package com.devesh.DesignPatterns.FactoryPattern;

import com.devesh.DesignPatterns.FactoryPattern.Shoes.Bottle;
import com.devesh.DesignPatterns.FactoryPattern.Shoes.SteelBottle;

public class BottleClient_FactoryPatternDemo {
    public static void main(String[] args) {
        //Without Factory
        Bottle bottle1 = new SteelBottle(); //Client can see that car is being instantiated using BMW class
        bottle1.printBottleDetails();

        Bottle bottle = new BottleFactory_SteelDivision().shoeCustomerOrderingShoes();
        bottle.printBottleDetails();
    }
}
