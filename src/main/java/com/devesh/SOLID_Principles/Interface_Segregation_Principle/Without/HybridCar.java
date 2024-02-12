package com.devesh.SOLID_Principles.Interface_Segregation_Principle.Without;


public class HybridCar implements Car_Interface {
    @Override
    public String useBatteries() {
        return "Using Batteries.";
    }

    @Override
    public String usePetrol() {
        return "Using Petrol.";
    }
}
