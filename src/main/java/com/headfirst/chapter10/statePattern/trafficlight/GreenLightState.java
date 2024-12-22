package com.headfirst.chapter10.statePattern.trafficlight;

/**
 * Green Light state implementation.
 */
public class GreenLightState implements TrafficLightState {
    @Override
    public void changeLight(TrafficLight context) {
        System.out.println("Changing light to Yellow.");
        context.setState(new YellowLightState());
    }

    @Override
    public void display() {
        System.out.println("Green Light - GO!");
    }
}
