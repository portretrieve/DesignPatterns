package com.devesh.SOLID_Principles.Interface_Segregation_Principle.With;


public class HybridCar implements HybridCarInterface{
    @Override
    public String useBatteries() {
        return "Using Batteries.";
    }

    @Override
    public String usePetrol() {
        return "Using Petrol.";
    }
}
