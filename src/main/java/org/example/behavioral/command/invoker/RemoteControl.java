package org.example.behavioral.command.invoker;

import org.example.behavioral.command.command.Command;

public class RemoteControl {
    Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }
}
