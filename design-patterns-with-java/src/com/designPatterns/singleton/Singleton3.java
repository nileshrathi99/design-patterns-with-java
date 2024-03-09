package com.designPatterns.singleton;

public class Singleton3 {

    private static Singleton3 singleton3Instance = new Singleton3();

    private Singleton3(){}

    /**
     * If your application always creates and uses an instance of the Singleton
     * or the overhead of creation and runtime aspects of the Singleton are not onerous,
     *  you may want to create your Singleton eagerly
     *
     *  Using this approach, we rely on the JVM to create the unique instance of the Singleton when the class is loaded.
     *  The JVM guarantees that the instance will be created before any thread accesses the static uniqueInstance variable.
     * @return Singleton3
     */
    public static synchronized Singleton3 getInstance(){
        return singleton3Instance;
    }
}
