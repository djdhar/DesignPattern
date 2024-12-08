package org.example.behavioral.observer.driver;

import org.example.behavioral.observer.observer.NewsSubscriber;
import org.example.behavioral.observer.observer.Observer;
import org.example.behavioral.observer.subject.NewsAgency;

public class Driver {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer subscriber1 = new NewsSubscriber("Alice");
        Observer subscriber2 = new NewsSubscriber("Bob");
        Observer subscriber3 = new NewsSubscriber("Charlie");

        // Subscribing observers
        agency.subscribe(subscriber1);
        agency.subscribe(subscriber2);

        // Publishing news
        agency.publishNews("Breaking News: Observer Pattern Simplified!");

        // Adding another subscriber
        agency.subscribe(subscriber3);

        // Publishing more news
        agency.publishNews("Update: Observer Pattern Example Completed!");

        // Unsubscribing a subscriber
        agency.unsubscribe(subscriber1);

        // Publishing another news update
        agency.publishNews("Final Update: Thanks for Learning!");
    }
}
