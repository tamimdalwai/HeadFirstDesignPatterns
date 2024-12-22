package com.headfirst.chapter10.statePattern.trafficlight;

/**
 * Context for managing traffic light states.
 */
public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        currentState = new RedLightState(); // Initial state
    }

    public void setState(TrafficLightState state) {
        currentState = state;
    }

    public void changeLight() {
        currentState.changeLight(this);
    }

    public void display() {
        currentState.display();
    }
}

