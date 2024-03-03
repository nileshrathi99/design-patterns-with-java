package com.designPatterns.observer.weathermonitoringstation;

public interface Subject {

    public void registerObserver(Subscriber o);
    public void removeObserver(Subscriber o);
    public void notifyObservers();

}