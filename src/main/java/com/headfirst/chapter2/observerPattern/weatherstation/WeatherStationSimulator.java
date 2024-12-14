package com.headfirst.chapter2.observerPattern.weatherstation;

import com.headfirst.chapter2.observerPattern.weatherstation.observers.CurrentConditionsDisplay;
import com.headfirst.chapter2.observerPattern.weatherstation.subject.WeatherData;

public class WeatherStationSimulator {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        weatherData.registerObserver(currentDisplay);

        // Simulate new weather data
        weatherData.setMeasurements(25.0f, 65.0f, 1013.0f);
        weatherData.setMeasurements(30.0f, 70.0f, 1012.0f);

        // remove observer from the list
        weatherData.removeObserver(currentDisplay);

        // new weather data but no observer is present so no output to console
        weatherData.setMeasurements(21.0f, 61.0f, 113.0f);


    }
}
