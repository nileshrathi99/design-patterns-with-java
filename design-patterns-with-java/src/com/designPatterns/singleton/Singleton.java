package com.designPatterns.singleton;

public class Singleton {

    private static Singleton singletonInstance;

    private Singleton(){}

    /**
     * not thread safe
     * @return Singleton
     */
    public static Singleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    // other methods
}
