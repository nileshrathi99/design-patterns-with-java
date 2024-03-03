package com.designPatterns.observer.weathermonitoringstation.publishers;

import com.designPatterns.observer.weathermonitoringstation.Subscriber;
import com.designPatterns.observer.weathermonitoringstation.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Subscriber> subscribers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Subscriber o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Subscriber o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Subscriber subscriber : subscribers)
            subscriber.update(temperature, humidity, pressure);
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

}
