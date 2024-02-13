package com.devesh.DesignPatterns.FactoryPattern.FactoryPatternWIthOC;

import com.devesh.DesignPatterns.FactoryPattern.Bottles.Bottle;
import com.devesh.DesignPatterns.FactoryPattern.Bottles.SteelBottle;

public class BottleFactory_SteelDivision extends BottleFactory {
    @Override
    public Bottle getBottleForCustomer() {
        return new SteelBottle();
    }
}
