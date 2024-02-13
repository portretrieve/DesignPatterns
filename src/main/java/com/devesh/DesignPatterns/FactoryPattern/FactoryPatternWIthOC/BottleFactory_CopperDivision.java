package com.devesh.DesignPatterns.FactoryPattern.FactoryPatternWIthOC;

import com.devesh.DesignPatterns.FactoryPattern.Bottles.Bottle;
import com.devesh.DesignPatterns.FactoryPattern.Bottles.CopperBottle;

public class BottleFactory_CopperDivision extends BottleFactory {
    @Override
    public Bottle getBottleForCustomer() {
        return new CopperBottle();
    }
}
