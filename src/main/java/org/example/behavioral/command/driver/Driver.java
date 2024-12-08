package org.example.behavioral.command.driver;

import org.example.behavioral.command.command.Command;
import org.example.behavioral.command.command.TurnOffLightCommand;
import org.example.behavioral.command.command.TurnOnLightCommand;
import org.example.behavioral.command.invoker.RemoteControl;
import org.example.behavioral.command.receiver.Light;

public class Driver {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command turnOnLightCommand = new TurnOnLightCommand(livingRoomLight);
        Command turnOffLightCommand = new TurnOffLightCommand(livingRoomLight);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnLightCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOffLightCommand);
        remoteControl.pressButton();
    }
}
