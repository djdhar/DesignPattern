package org.example.behavioral.command.command;

import org.example.behavioral.command.receiver.Light;

public class TurnOnLightCommand implements Command {
    Light light;
    public TurnOnLightCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
