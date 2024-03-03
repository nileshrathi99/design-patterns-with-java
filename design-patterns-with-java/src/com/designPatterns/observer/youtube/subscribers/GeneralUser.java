package com.designPatterns.observer.youtube.subscribers;

import com.designPatterns.observer.youtube.Publisher;
import com.designPatterns.observer.youtube.Subscriber;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GeneralUser implements Subscriber, User {

    private String name;

    public GeneralUser(String name){
        this.name = name;
    }

    @Override
    public void watch(Publisher p) {
        System.out.println(this.name +" is watching");
        p.showContents();
        p.myChannel();
    }

    @Override
    public void notify(Publisher p) {
        watch(p);
    }

}
