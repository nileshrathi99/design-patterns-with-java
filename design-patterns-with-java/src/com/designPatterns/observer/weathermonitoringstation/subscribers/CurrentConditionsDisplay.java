package com.designPatterns.observer.weathermonitoringstation.subscribers;

import com.designPatterns.observer.weathermonitoringstation.Subscriber;
import com.designPatterns.observer.weathermonitoringstation.Subject;

public class CurrentConditionsDisplay implements Subscriber, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
