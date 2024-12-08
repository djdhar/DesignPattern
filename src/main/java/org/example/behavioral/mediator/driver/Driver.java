package org.example.behavioral.mediator.driver;

import org.example.behavioral.mediator.colleague.ChatUser;
import org.example.behavioral.mediator.colleague.User;
import org.example.behavioral.mediator.mediator.ChatMediator;
import org.example.behavioral.mediator.mediator.ChatRoom;

public class Driver {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();
        User user1 = new ChatUser(chatMediator, "Dibya");
        User user2 = new ChatUser(chatMediator, "Alice");
        User user3 = new ChatUser(chatMediator, "Bob");
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        user1.sendMessage("This is Dibya's message.");
        user2.sendMessage("This is Alice's message.");
        user3.sendMessage("This is Bob's message.");

    }
}
