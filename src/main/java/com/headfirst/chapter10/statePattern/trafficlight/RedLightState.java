package com.headfirst.chapter10.statePattern.trafficlight;

/**
 * Red Light state implementation.
 */
public class RedLightState implements TrafficLightState {
    @Override
    public void changeLight(TrafficLight context) {
        System.out.println("Changing light to Green.");
        context.setState(new GreenLightState());
    }

    @Override
    public void display() {
        System.out.println("Red Light - STOP!");
    }
}
