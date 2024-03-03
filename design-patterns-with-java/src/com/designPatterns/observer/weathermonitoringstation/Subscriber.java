package com.designPatterns.observer.weathermonitoringstation;

public interface Subscriber {

    public void update(float temperature, float humidity, float pressure);
}
