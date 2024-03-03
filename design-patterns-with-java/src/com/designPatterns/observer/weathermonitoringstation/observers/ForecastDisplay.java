package com.designPatterns.observer.weathermonitoringstation.observers;

import com.designPatterns.observer.weathermonitoringstation.Subject;
import com.designPatterns.observer.weathermonitoringstation.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Watch out: " + temperature + "F degrees, " + humidity + "% humidity and " + pressure +" pressure");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
