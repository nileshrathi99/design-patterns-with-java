package com.designPatterns.observer.youtube.publishers;

import com.designPatterns.observer.youtube.Publisher;
import com.designPatterns.observer.youtube.Subscriber;

import java.util.ArrayList;

public class Neetcode implements Publisher {

    private ArrayList<Subscriber> subscribers;
    private int video;

    public Neetcode(){
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
        for(Subscriber s: this.subscribers)
            s.notify(this);
    }

    @Override
    public void myChannel(){
        System.out.println("Watching Neetcode");
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
