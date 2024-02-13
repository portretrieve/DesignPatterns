package com.devesh.DesignPatterns.FactoryPattern.Bottles;

public class SteelBottle implements Bottle {
    @Override
    public void printBottleDetails() {
        System.out.println("I am Steel Bottle.");
    }
}
