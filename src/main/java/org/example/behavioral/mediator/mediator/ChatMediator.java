package org.example.behavioral.mediator.mediator;

import org.example.behavioral.mediator.colleague.User;

public interface ChatMediator {
    void addUser(User user);
    void sendMessage(String message, User user);
}
