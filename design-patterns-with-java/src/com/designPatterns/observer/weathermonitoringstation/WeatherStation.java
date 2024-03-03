package com.designPatterns.observer.weathermonitoringstation;

import com.designPatterns.observer.weathermonitoringstation.subscribers.CurrentConditionsDisplay;
import com.designPatterns.observer.weathermonitoringstation.subscribers.ForecastDisplay;
import com.designPatterns.observer.weathermonitoringstation.subscribers.StatisticsDisplay;
import com.designPatterns.observer.weathermonitoringstation.publishers.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.5f);
        weatherData.setMeasurements(70, 55, 35.5f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(60, 45, 40);
        forecastDisplay.display();
    }
}
