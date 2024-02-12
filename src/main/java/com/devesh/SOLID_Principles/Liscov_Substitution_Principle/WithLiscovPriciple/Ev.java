package com.devesh.SOLID_Principles.Liscov_Substitution_Principle.WithLiscovPriciple;

//Using Composition using Car Class.
//We can use whichever class we need of car class now.
public class Ev {

    private Car car = new Car();

    public void usePowerToRun(){
        System.out.println(car.useBatteries());
    }

}
