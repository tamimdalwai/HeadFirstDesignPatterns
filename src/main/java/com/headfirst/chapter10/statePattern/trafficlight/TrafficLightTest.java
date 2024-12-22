package com.headfirst.chapter10.statePattern.trafficlight;

/**
 * Client to test the Traffic Light System using the State Pattern.
 */
public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.display();
        trafficLight.changeLight();

        trafficLight.display();
        trafficLight.changeLight();
    }
}
