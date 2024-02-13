package com.devesh.DesignPatterns.FactoryPattern.FactoryPatternNavin;

import com.devesh.DesignPatterns.FactoryPattern.Bottles.Bottle;
import com.devesh.DesignPatterns.FactoryPattern.Bottles.CopperBottle;
import com.devesh.DesignPatterns.FactoryPattern.Bottles.GlassBottle;
import com.devesh.DesignPatterns.FactoryPattern.Bottles.SteelBottle;

public class BottleFactory_Navin {
    public Bottle getBottle(String bottleType){
        switch (bottleType){
            case "glass": return new GlassBottle();
            case "steel": return new SteelBottle();
            default: return new CopperBottle();
        }
    }
}
