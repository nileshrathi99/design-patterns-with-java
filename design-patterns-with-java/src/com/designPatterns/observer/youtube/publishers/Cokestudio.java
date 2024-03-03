package com.designPatterns.observer.youtube.publishers;

import com.designPatterns.observer.youtube.Publisher;
import com.designPatterns.observer.youtube.Subscriber;

import java.util.ArrayList;

public class Cokestudio implements Publisher {

    private ArrayList<Subscriber> subscribers;
    private int video;

    public Cokestudio(){
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber s) {
        this.subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        this.subscribers.remove(s);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber s: subscribers)
            s.notify(this);
    }

    @Override
    public void myChannel(){
        System.out.println("Listening CokeStudio");
    }

    @Override
    public void showContents() {
        System.out.println("Showing "+ this.video);
    }

    public void upload(int video){
        this.video = video;
        notifySubscribers();
    }
}
