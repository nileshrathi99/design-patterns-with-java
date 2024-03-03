package com.designPatterns.observer.weathermonitoringstation;

import com.designPatterns.observer.weathermonitoringstation.observers.Observer;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}