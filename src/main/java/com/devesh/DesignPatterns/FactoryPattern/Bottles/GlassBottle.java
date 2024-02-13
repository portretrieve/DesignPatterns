package com.devesh.DesignPatterns.FactoryPattern.Bottles;

public class GlassBottle implements Bottle {
    @Override
    public void printBottleDetails() {
        System.out.println("I am Glass Bottle.");
    }
}
