package com.designPatterns.observer.youtube;

public interface Publisher {

    public void addSubscriber(Subscriber s);
    public void removeSubscriber(Subscriber s);
    public void notifySubscribers();
    public void myChannel();
    public void showContents();

}
