package com.designPatterns.observer.weathermonitoringstation.subscribers;

import com.designPatterns.observer.weathermonitoringstation.Subscriber;
import com.designPatterns.observer.weathermonitoringstation.Subject;

public class StatisticsDisplay implements Subscriber, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Stats: " + temperature + "F degrees, " + humidity + "% humidity and " + pressure +" pressure");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
