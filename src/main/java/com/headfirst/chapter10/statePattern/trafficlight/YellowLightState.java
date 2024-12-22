package com.headfirst.chapter10.statePattern.trafficlight;

/**
 * Yellow Light state implementation.
 */
public class YellowLightState implements TrafficLightState {
    @Override
    public void changeLight(TrafficLight context) {
        System.out.println("Changing light to Red.");
        context.setState(new RedLightState());
    }

    @Override
    public void display() {
        System.out.println("Yellow Light - SLOW DOWN!");
    }
}

