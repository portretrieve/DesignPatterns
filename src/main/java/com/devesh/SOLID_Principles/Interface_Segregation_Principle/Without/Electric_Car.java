package com.devesh.SOLID_Principles.Interface_Segregation_Principle.Without;

//Forced to implement both methods even though we dont need usePetrol() here
//Keep You Interfaces Lightweight and seperate functionalities as needed

public class Electric_Car implements Car_Interface {
    @Override
    public String useBatteries() {
        return "Using Batteries.";
    }

    @Override
    public String usePetrol() {
        return null;
//        throw new Exception("EVs don't use petrol. Throwing " +
//                "this exception as you tried to use petrol in an EV");
    }
}
