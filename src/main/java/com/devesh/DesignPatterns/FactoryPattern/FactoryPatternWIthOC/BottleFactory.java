package com.devesh.DesignPatterns.FactoryPattern.FactoryPatternWIthOC;

import com.devesh.DesignPatterns.FactoryPattern.Bottles.Bottle;

public abstract class BottleFactory {

    public Bottle placeBottleOrder(){
         return this.getBottleForCustomer();
    }

    public abstract Bottle getBottleForCustomer();
}

