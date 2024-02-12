package com.devesh.SOLID_Principles.Liscov_Substitution_Principle.WithoutLiscovPriciple;

//Bad Idea as This Electic Vehicle now has access to both
//UsePetrol and UseBatteries methods of Superclass.
//Electic vehicles don't use petrol. So bad Implementation
//Should not inherit
public class ElecticVehicle extends HybridVehicle{

}
