package com.designPatterns.singleton;

public class Singleton4 {

    /**
     * The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly when it is being initialized to the Singleton instance.
     *
     * The volatile keyword in Java is a type of variable modifier that tells the JVM (Java Virtual Machine) that a variable can be accessed and modified by multiple threads.
     * When you declare a variable as volatile, the JVM ensures that all threads see the most up-to-date value of that variable.
     * This is because the JVM will not cache the value of a volatile variable in a thread's local memory. Instead, the JVM will always read the value of a volatile variable from main memory.
     * The volatile keyword is often used in multithreaded applications to ensure that shared data is always consistent.
    **/
    private volatile static Singleton4 singleton4Instance;

    private Singleton4(){}

    /**
     * With double-checked locking, we first check to see if an instance is created,
     * and if not, THEN we synchronize. This way, we only synchronize the first time through, just what we want.
     * @return Singleton4
     */
    public static Singleton4 getInstance(){
        if(singleton4Instance == null){
            synchronized (Singleton4.class){
                if(singleton4Instance == null) {
                    singleton4Instance = new Singleton4();
                }

            }
        }
        return singleton4Instance;
    }

}
