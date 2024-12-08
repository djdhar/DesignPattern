package org.example.behavioral.observer.subject;
import org.example.behavioral.observer.observer.Observer;

interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}

