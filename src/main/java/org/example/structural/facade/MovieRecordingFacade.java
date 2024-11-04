package org.example.structural.facade;

public class MovieRecordingFacade {
    Light light = new Light();
    Camera camera = new Camera();
    Action action = new Action();
    public void initiate() {
        light.on();
        camera.on();
        action.start();
    }
    public void terminate() {
        action.end();
        camera.off();
        light.off();
    }
}
