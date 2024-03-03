package com.designPatterns.observer.weathermonitoringstation.observers;

public interface Observer {

    public void update(float temperature, float humidity, float pressure);
}
