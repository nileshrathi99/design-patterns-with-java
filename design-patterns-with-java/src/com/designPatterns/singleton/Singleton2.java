package com.designPatterns.singleton;

public class Singleton2 {

    public static Singleton2 singleton2Instance;

    private Singleton2(){}

    /**
     * thread safe, no two threads can access it at same time, only once synchronisation is needed when instantiating
     * issue: causes overhead, decreases performance by factor of 100
     * do nothing if this performance isn't critical for you app
     * @return Singleton2
     */
    public static synchronized Singleton2 getInstance(){
        if(singleton2Instance == null){
            singleton2Instance = new Singleton2();
        }
        return singleton2Instance;
    }

    // other methods
}
