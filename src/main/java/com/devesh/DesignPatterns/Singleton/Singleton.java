package com.devesh.DesignPatterns.Singleton;

public class Singleton {
    //Create Static instance
    private static Singleton singletonObj = new Singleton();

    //Constructor is private
    private Singleton(){}

    //Static method to fetch the single object already created
    public static Singleton getInstance(){
        return singletonObj;
    }

}
