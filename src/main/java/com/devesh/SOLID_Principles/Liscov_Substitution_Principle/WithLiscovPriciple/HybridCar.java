package com.devesh.SOLID_Principles.Liscov_Substitution_Principle.WithLiscovPriciple;

//Using Composition using Car Class.
//We can use whichever method we need of car class now.
public class HybridCar {

    private Car car = new Car();

    public void usePetrolToRun(){
        System.out.println(car.usePetrol());
    }

    public void usePowerToRun(){
        System.out.println(car.useBatteries());
    }

}
