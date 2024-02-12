package com.devesh.SOLID_Principles.Interface_Segregation_Principle.With;

public class ElectricCar implements ElectricCarInterface{
    @Override
    public String useBatteries() {
        return "Using Batteries.";
    }
}
