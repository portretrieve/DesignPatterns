package com.devesh.DesignPatterns.FactoryPattern;

import com.devesh.DesignPatterns.FactoryPattern.Shoes.Bottle;
import com.devesh.DesignPatterns.FactoryPattern.Shoes.CopperBottle;
import com.devesh.DesignPatterns.FactoryPattern.Shoes.GlassBottle;
import com.devesh.DesignPatterns.FactoryPattern.Shoes.SteelBottle;

public abstract class BottleFactory {

    public Bottle shoeCustomerOrderingShoes(){
         return this.orderShoesForCustomer();
    }

    public abstract Bottle orderShoesForCustomer();
}

class BottleFactory_CopperDivision extends BottleFactory {
    @Override
    public Bottle orderShoesForCustomer() {
        return new CopperBottle();
    }
}

class BottleFactory_SteelDivision extends BottleFactory {
    @Override
    public Bottle orderShoesForCustomer() {
        return new SteelBottle();
    }
}

class BottleFactory_GlassDivision extends BottleFactory {
    @Override
    public Bottle orderShoesForCustomer() {
        return new GlassBottle();
    }
}