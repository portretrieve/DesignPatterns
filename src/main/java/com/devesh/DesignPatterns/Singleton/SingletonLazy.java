package com.devesh.DesignPatterns.Singleton;

import java.lang.reflect.Constructor;

//With Synchronized to be used by multiple threads
public class SingletonLazy {

    private static SingletonLazy singletonObject;

    private SingletonLazy(){
        System.out.println("Instance Created");
    }

    //Instance is lazily created upon request
    //Synchronized will make sure it's thread-safe too
    public static synchronized SingletonLazy getSigletonObject(){
        if (singletonObject == null){
            return new SingletonLazy();
        }
        return singletonObject;
    }

}
