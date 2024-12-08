package org.example.behavioral.command.command;

import org.example.behavioral.command.receiver.Light;

public class TurnOffLightCommand implements Command {
    Light light;
    public TurnOffLightCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}
