package org.example.behavioral.mediator.colleague;

import org.example.behavioral.mediator.mediator.ChatMediator;

public abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);

}
