package com.headfirst.chapter10.statePattern.trafficlight;

/**
 * State interface for traffic light behaviors.
 */
public interface TrafficLightState {
    void changeLight(TrafficLight context);
    void display();
}
