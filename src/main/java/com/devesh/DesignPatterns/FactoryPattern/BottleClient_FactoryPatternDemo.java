package com.devesh.DesignPatterns.FactoryPattern;

import com.devesh.DesignPatterns.FactoryPattern.Bottles.Bottle;
import com.devesh.DesignPatterns.FactoryPattern.Bottles.SteelBottle;
import com.devesh.DesignPatterns.FactoryPattern.FactoryPatternNavin.BottleFactory_Navin;
import com.devesh.DesignPatterns.FactoryPattern.FactoryPatternWIthOC.BottleFactory_CopperDivision;
import com.devesh.DesignPatterns.FactoryPattern.FactoryPatternWIthOC.BottleFactory_GlassDivision;

public class BottleClient_FactoryPatternDemo {
    public static void main(String[] args) {
        //Without Factory
        Bottle bottle = new SteelBottle(); //Client can see that car is being instantiated using BMW class
        bottle.printBottleDetails();

        //Factory Pattern with OC Principle
        Bottle bottle1 = new BottleFactory_CopperDivision().placeBottleOrder();
        bottle.printBottleDetails();

        //Factory Pattern without OC Principle: Telusco
        Bottle bottle2 = new BottleFactory_Navin().getBottle("glass");
        bottle2.printBottleDetails();

    }
}
