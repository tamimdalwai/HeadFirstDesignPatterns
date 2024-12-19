package com.headfirst.chapter7.facadePattern.subsystems;

/**
 * Facade class to simplify interactions with the Home Theater subsystems.
 */
public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final Projector projector;
    private final TheaterLights lights;

    /**
     * Constructor to initialize subsystems.
     *
     * @param amplifier the amplifier subsystem
     * @param projector the projector subsystem
     * @param lights    the theater lights subsystem
     */
    public HomeTheaterFacade(Amplifier amplifier, Projector projector, TheaterLights lights) {
        this.amplifier = amplifier;
        this.projector = projector;
        this.lights = lights;
    }

    /**
     * Simplifies the process of preparing the home theater for a movie.
     */
    public void watchMovie() {
        System.out.println("Getting ready to watch a movie...");
        lights.dim();
        amplifier.on();
        amplifier.setVolume(10);
        projector.on();
        projector.wideScreenMode();
        System.out.println("Movie is starting!");
    }
}