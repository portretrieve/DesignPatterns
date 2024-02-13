package com.devesh.DesignPatterns.FactoryPattern.FactoryPatternWIthOC;

import com.devesh.DesignPatterns.FactoryPattern.Bottles.Bottle;
import com.devesh.DesignPatterns.FactoryPattern.Bottles.GlassBottle;

public class BottleFactory_GlassDivision extends BottleFactory {
    @Override
    public Bottle getBottleForCustomer() {
        return new GlassBottle();
    }
}
